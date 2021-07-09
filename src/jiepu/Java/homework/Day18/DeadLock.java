package jiepu.Java.homework.Day18;

/**
 * @author lnh
 * @date 2021年06月24日 16:11
 */
public class DeadLock {
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        Thread t=new Thread(new MyThread1(o1,o2));
        Thread t1=new Thread(new MyThread2(o1,o2));
        t.start();
        t1.start();
    }
}
class MyThread1 implements Runnable{
    private Object o1;
    private Object o2;

    public MyThread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }
    }
}

class MyThread2 implements Runnable{
    private Object o1;
    private Object o2;

    public MyThread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){

            }
        }
    }
}