package systematicLearn.Java.homework.Day18;

/**
 * @author lnh
 * @date 2021年06月24日 18:45
 */
public class ThreadTest {
    public static void main(String[] args) {
        Data data=new Data();
        Thread t1=new Thread(new Add(data));
        Thread t2=new Thread(new Add(data));
        Thread t3=new Thread(new Sub(data));
        Thread t4=new Thread(new Sub(data));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class Sub implements Runnable{
    private final Data data;

    public Sub(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            synchronized (data){
                if (data.num<0){
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                data.num--;
                System.out.println(Thread.currentThread().getName()+">>>>>"+data.num);
                data.notifyAll();
            }
        }
    }
}
class Add implements Runnable{
    private final Data data;

    public Add(Data data) {
        this.data = data;
    }
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            synchronized (data){
                if (data.num>6){
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                data.num++;
                System.out.println(Thread.currentThread().getName()+">>>>>"+data.num);
                data.notifyAll();
            }
        }
    }
}
class Data {
    public int num;
}