package com.Day12;

public class ThreadTest {
    public static void main(String[] args) {

        try {
            Thread.sleep(1000*6);//出现在那个线程中就让那个线程休眠5秒
            // 静态方法 >>>>>和调用的对象没关系  只和当前线程有关系   看出现的位置

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hellp word!");
    }
}
