package com.Day12.ThreadSafe;
/*
*
* 账户类
* */
public class Acconut {
    private String No;
    private double banlane;

    public Acconut() {
    }

    public Acconut(String no, double banlane) {
        No = no;
        this.banlane = banlane;
    }

    public double getBanlane() {

        return banlane;
    }

    public void setBanlane(double banlane) {
        this.banlane = banlane;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }



    /*
    *         synchronized (){}
    *
    * 里面放代码块(会发生数据安全的问题的操作)   括号中填写要线程同步的共享对象
    *
    * 填入共享对象就可以但对象只有一个而线程不需要同步 >>>>>>>会导致所有线程都同步
    *
    *
    *
    *  锁机制   ：   对于先到达的线程  获得锁  执行    >>>>>后来的线程  得不到锁，不能执行同步代码块
    * 只能等待    等待前面的线程将锁归还  得到锁才能运行 同步代码块
    *
    *
    *
    * 这个给共享对象  一定是你需要同步线程的共享对象  切记
    *
    * */
    public  void Withdraw(double mony){
        synchronized (this){
            double before =this.banlane;
            double after=before-mony;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.banlane=after;
        }
    }
}
