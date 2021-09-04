package systematicLearn.Java.Thread;

/**
 * @author lnh
 * @date 2021年06月24日 11:20
 */
public class ConTest {
    public static void main(String[] args) {
        inre i=new inre();
        Thread t=new Thread(new Aby(i),"输出");
        Thread t1=new Thread(new Bby(i),"计算");
        t.start();
        t1.start();
    }
}
class Aby implements Runnable{
    private  inre integer;

    public Aby(inre integer) {
        this.integer = integer;
    }

    @Override
    public void run() {
        synchronized (integer){
            try {
                integer.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(integer.num);

        }


    }
}
class inre {
    public int num;

}
class Bby implements Runnable{
    private   inre integer;

    public Bby(inre integer) {
        this.integer = integer;
    }

    @Override
    public void run() {
        synchronized (integer){
            for (int i=1;i<=100;i++){
                integer.num=integer.num+i;
            }
            synchronized (integer){
                integer.notify();
            }
        }
    }
}