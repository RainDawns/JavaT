package systematicLearn.Java.homework.Day17;

/**
 * @author lnh
 * @date 2021年06月23日 16:06
 */
public class ThreadTest09 {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup  group=new ThreadGroup("测试组");
        RunTest r=new RunTest();
        Thread t=new Thread(group,r,"t3");
        Thread t1=new Thread(group,"t1");
        Thread t2=new Thread(group,"t2");
        Thread t3=new Thread(group,r,"t3");
        t.start();
        t3.start();
        t1.start();
        t2.start();
        System.out.println("创建时"+group.activeCount());
        Thread.sleep(1000);
        System.out.println("过了一秒后"+group.activeCount());
    }
}
class RunTest implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
    }
}
