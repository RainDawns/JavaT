package jiepu.Java.homework.Day17;

/**
 * @author lnh
 * @date 2021年06月23日 10:09
 */
public class ThreadTest04 {
    public static void main(String[] args) throws InterruptedException {
        //new  线程一般建议使用线程池
        //除了新建和死亡其他都是存活的
        Thread t=new Thread(new Test());
        System.out.println(t.getState());
        System.out.println(t.isAlive());
        t.start();
        t.join();//启动线程只能是start
        t.interrupt();
        t.isInterrupted();

        // 让当前位置的线程的停止  (运行这行代码的线程阻塞)   waiting
        // 然后调用join方法的线程先运行 当线程运行完之后   才会运行当前的位置的线程
        //和sleep方法类似相反
//        System.out.println(Thread.currentThread().getState());
        System.out.println(t.getState());
        System.out.println(">>>>>>>>>>>");
        System.out.println(t.isAlive());
        Thread.sleep(1000*4);
        System.out.println(t.getState());
        System.out.println(t.isAlive());
    }
}

class Test implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000*5);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getState());
    }
}