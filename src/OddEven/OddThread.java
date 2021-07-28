package OddEven;

import java.util.ArrayList;

public class OddThread extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 10; i=i+2) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
