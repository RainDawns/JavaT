package com.Day12;
/*
* 子类不能抛出比父类更宽泛后者更多的异常
*
*run 方法的异常只能try /catch
*
*
* 中止线程的睡眠    而不是运行
* */
public class ThreadTest01 {
    public static void main(String[] args) {
        Thread a=new Thread();
        a.interrupt();//中断线程的睡眠  想让睡眠的线程启动
        //依靠java的异常处理机制

    }
}
