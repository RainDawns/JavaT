package jiepu.Java.homework.Day17;

/**
 * @author lnh
 * @date 2021年06月23日 15:03
 */

public class ThreadTest05 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.setName("t");
        System.out.println(mt.getName() + "线程" + mt.getState());
        mt.start();
        Thread.sleep(300);
        System.out.println(mt.getName() + "线程" + "sleep之后" + mt.getState());
        Thread.sleep(1000 * 6);
        System.out.println(mt.getName() + "线程" + "join其他线程之后" + mt.getState());
        Thread.sleep(1000 * 4);
        System.out.println(mt.getName() + "线程" + mt.getState());
        mt.setPriority(10);

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程" + "sleep前" + Thread.currentThread().getState());
        try {
            Thread.sleep(1000 * 4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "线程" + "join其他线程之前" + Thread.currentThread().getState());
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000 * 4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {

        }

    }
}