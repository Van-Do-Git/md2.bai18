package ThreadSimple;

public class testThreadSimple implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        testThreadSimple test1 = new testThreadSimple();
        testThreadSimple test2 = new testThreadSimple();
        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test2);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
