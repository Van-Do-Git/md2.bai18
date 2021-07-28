package CountNumbe;

public class Main {

    public static void main(String args[])
    {
        Count count = new Count();
        Thread abc = new Thread(count);
        abc.start();
        try
        {
            while(abc.isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over" );
    }
}