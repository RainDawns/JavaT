package com.Day12.ThreadSafe2;

/*
*
*账户线程类   对于多线程 >>>>>创建多个线程对同一个对象操作      这里到构造对象  对其操作
*
* */
public class ThreadAcconut implements Runnable {
    private Acconut act;

    public ThreadAcconut(Acconut act) {
        this.act = act;
    }
    public void run(){
        double money=5000;
        act.Withdraw(money);
        System.out.println(Thread.currentThread().getName()+"对账户"+act.getNo()+"成功取款  余额"+act.getBanlane());
    }
}
