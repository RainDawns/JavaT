package systematicLearn.Java.Thread;

/**
 * @author lnh
 * @date 2021年06月22日 10:21
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        /*
         * 线程一般需要重写run 不重写这个线程一般都没有意义
         * */
        Thread t = new Thread(() -> {
            System.out.println("匿名内部类实现");
            System.out.println("线程t的名字：" + Thread.currentThread().getName());
//                return;
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });
        /*
        * 对于一些题目的本质就是理解或者看清数据的存储关系 当使用第一层的是引用类型的时候   需要
        *
        * */
        t.setName("t1");
        Thread t1 = new MyThread();
        t1.setName("t2");
        t.start();
//        t.run();//并不会启动线程  仅仅就是调用方法而已
        t1.start();
//
//
        if (3 != 4) {
            System.out.println("?");
        }
        Runnable m = new MyThread1();
        Thread t3 = new Thread(m);
        t3.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread");
        System.out.println("线程t1的名字:" + Thread.currentThread().getName());

    }
}

class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("runnable  实现的线程类  ");
        System.out.println("线程t3的名字:" + Thread.currentThread().getName());//和线程名字无关只和在代码结构中的位置有关
    }

}