package systematicLearn.Java.Thread;

/**
 * @author lnh
 * @date 2021年06月24日 11:14
 */

public class ThreadTest04 {
    public static void main(String[] args) throws InterruptedException {

        /*
        * 三种方法     锁对象调用，在同步代码块
        * */
        P p=new P();
        p.wait();//释放锁并等待   进入waiting
        p.notify();//唤醒线程   并不加锁   进入runnable 并不是直接运行  抢占cpu
        p.notifyAll();
    }
}
class  P  implements Runnable{

    @Override
    public void run() {

    }
}
class  C implements Runnable{

    @Override
    public void run() {

    }
}

