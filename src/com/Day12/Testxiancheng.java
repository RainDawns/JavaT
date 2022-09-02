package com.Day12;


/*
java运行 原则：
方法体中的代码都是自上而下执行的
*
* */
public class Testxiancheng {
    /*
    * 进程  独立
    * 线程   堆和方法区共享
    *           栈独立   多线程就是多个栈
    *           互不干扰  就是 多线程并发    提高程序的处理效率
    *
    *
    * 一般来说Java程序至少2线程  一个线程负责main方法   一个方法 负责启动垃圾回收线程,回收垃圾
    *main方法结束  不代表其他线程结束>>>>>只能代表主线程结束
    * */
    public static void main(String[] args) {

         Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());//当前线程对象的名字
        //第一种方法
        mythread mythread=new mythread();
        mythread.start();//瞬间结束   >>>>>启动分支栈，开辟新的占空间
        //成功启动线程  就会自动调用run方法  这个调用是jvm 的线程调用管理方法自动


        //第二种方法
        Thread t =new Thread(new  test());
        System.out.println(t.getName());//获取线程的名字     Thread-1
        //t.setname  设置线程的名字

        t.start();
    }
static class  mythread extends Thread{
    @Override
    public void run() {
        System.out.println("fnvb");
    }
}
//定义一个可运行的类
static class test implements Runnable{

    @Override
    public void run() {
        System.out.println("why ");
    }
}
}
