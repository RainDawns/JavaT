package com.Day12;

import java.util.ArrayList;
import java.util.List;

/*
* wait 方法 和 notify 方法是属于object类中  并不是只属于 线程当中的
* >>>>>>建立在线程安全之上  就是synchronized线程同步的机制之上
*
* wait 方法   ：对象上活动的线程进入等待    这个等待是无限期的
* 直到被唤醒为止  >>>>>.让当前的线程进入等待状态
* 释放占有对象上的锁
*
* notify方法  ：唤醒对象上等待的线程   和wait方法相配合使用
* notifyall  所有的等待线程
* 这里不会释放  仅仅就是通知
*
*
* 生产者和消费者：相平衡
*
*
* 生产者和消费者模式
*
* */
public class Test01 {
    public static void main(String[] args) {
            //创建一个共享仓库
            List list=new ArrayList();
            Thread t1=new Thread(new Producer(list));
            Thread t2=new Thread(new Consumer(list));
            t1.setName("生产者线程");
            t2.setName("消费者线程");
            t1.start();
            t2.start();

    }
//生产者线程
    static class  Producer implements Runnable{
        private List list;

        public Producer(List list) {
            this.list=list;
        }

        @Override
            public void run() {
                //一直生产
                while (true){
                    synchronized (list){
                        if (list.size()>0){
                            try {
                                list.wait();
                                //释放锁·
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        Object obj=new Object();
                        list.add(obj);
                        System.out.println(Thread.currentThread().getName()+">>>>"+obj);
                        list.notifyAll();
                    }
                }
            }
        }

    //消费者

    static class  Consumer implements Runnable{
        private List list;

        public Consumer(List list) {
            this.list=list;
        }
        @Override
        public void run() {
            while (true){
                synchronized (list){
                    if (list.size()==0){
                        try {
                            list.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //仓库中含有数据
                    Object obj = list.remove(0);
                    System.out.println(Thread.currentThread().getName() + ">>>>" + obj);
                    list.notifyAll();
                }
            }
        }
    }
}
