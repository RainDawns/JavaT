package com.Day12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
* 线程的第三种实现方式
*       实现callable 接口
* */
public class ThreadTest05 {
    public static void main(String[] args) {

        //创建未来任务类对象   将一个继承了 callable 的实现类

        FutureTask task=new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                //执行结果
                return "test";
            }
        });

        Thread t=new Thread(task);
        t.start();

        //获取其他线程的结果
        //等待其他线程的执行的结束    get方法会阻塞当前线程   可以拿到其他的线程的返回值
        //效率较低
        try {
            Object o = task.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
