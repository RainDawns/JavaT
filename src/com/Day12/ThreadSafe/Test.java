package com.Day12.ThreadSafe;
/*
* 锁的使用方法    对象锁   100个对象  100把锁
*
*                   方法上
*                   同步块上
*
* 静态方法上  >>>>>.  类锁    100个对象一把锁
*
* */
public class Test {
    public static void main(String[] args) {
        Acconut act=new Acconut("01",10000);
        Thread t1=new Thread(new ThreadAcconut(act));
        Thread t2=new Thread(new ThreadAcconut(act));
        t1.setName("t1");
        t2.setName("t2");
        t2.start();
        t1.start();
    }
}
