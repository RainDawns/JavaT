package com.Day12.ThreadSafe2;
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
* 在实例方法上加synchronized    可以
*
* 这里锁的一定是this
* 这种方法不灵活    可能会扩大同步范围
*
*
* 优点：
*   代码简洁   如果共享对象为this且整个方法都需要同步   建议使用
*
*
* 局部变量不存在线程安全问题
*
*
*/
    public synchronized void Withdraw(double mony){

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
