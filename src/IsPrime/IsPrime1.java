package IsPrime;

public class IsPrime1 extends Thread{
    public void run(){
        for (int i = 2; i < 100; i++) {
            isEven(i);
        }
    }
    public void isEven(int i){
        boolean isEven = true;
        for (int j = 2; j <i; j++) {
            if (i%j==0)
                isEven = false;
        }
        if(isEven)
            System.out.println(i);
    }
}
