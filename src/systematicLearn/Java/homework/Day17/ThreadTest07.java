package systematicLearn.Java.homework.Day17;

/**
 * @author lnh
 * @date 2021年06月23日 15:35
 */
public class ThreadTest07 {
    public static void main(String[] args) throws InterruptedException {
        Thread T1=new Thread(new run(),"T1");
        T1.start();
        T1.join();
        Thread T2=new Thread(new run(),"T2");
        T2.start();
        T2.join();
        Thread T3=new Thread(new run(),"T3");
        T3.start();
        T3.join();

    }
}
class run implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始运行");
        System.out.println(Thread.currentThread().getName()+"结束运行");
    }
}
