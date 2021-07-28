package OddEven;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread(){
            public void run(){
                for (int i = 0; i < 3; i++) {
                    System.out.println("sleeping");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                };
            }
        };
        oddThread.start();
        evenThread.join();
        evenThread.start();
    }
}
