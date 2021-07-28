package Runable;

public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Dừng vòng lặp trong 50 ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread running... ");
        RunnableDemo rab1  = new RunnableDemo("Xin chao");
        rab1.start();
        RunnableDemo rab2 = new RunnableDemo("Tam biet");
        rab2.start();
        System.out.println("Main thread stopped!!! ");
    }
}
