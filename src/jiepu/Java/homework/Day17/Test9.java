package jiepu.Java.homework.Day17;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lnh
 * @date 2021年06月22日 19:02
 */
/*
模拟多个人通过一个山洞：
1.这个山洞每次只能通过一个人，每个人通过山洞的时间为1秒；
2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。
显示每次通过山洞人的姓名，和通过顺序；
 */
public class Test9 {
    public static void main(String[] args) {
/*
        Hole hole1 = new Hole();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(hole1);
            t.start();
        }
*/
        //使用锁
        int numOfCrossed = 0;
        int[] theTest = new int[1];
        //锁必须是同一个，下面synchronized的参数同理，关于synchronized参数并没有限制
        Lock lock = new ReentrantLock();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                lock.lock();
                crossTheHole(theTest);
                lock.unlock();
            }).start();
        }
    }

    public static void crossTheHole(int[] numOfCrossed){
        String name = Thread.currentThread().getName();
        System.out.println(name+"正在穿过洞");
        try {
            Thread.sleep(600);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        numOfCrossed[0]++;
        System.out.println(name+"穿过了山洞,他是第"+ numOfCrossed[0] +"个");
    }
}

class Hole implements Runnable{
    int numOfCrossed = 0;
    Object lock = new Object();
    @Override
    public void run(){
        crossTheHole2();
    }
    //同步代码块
    public void crossTheHole(){
        synchronized (lock){
            String name = Thread.currentThread().getName();
            System.out.println(name+"正在穿过洞");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            numOfCrossed++;
            System.out.println(name+"穿过了山洞,他是第"+ numOfCrossed +"个");
        }
    }
    //同步方法
    public synchronized void crossTheHole2(){
        String name = Thread.currentThread().getName();
        System.out.println(name+"正在穿过洞");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        numOfCrossed++;
        System.out.println(name+"穿过了山洞,他是第"+ numOfCrossed +"个");
    }
}
