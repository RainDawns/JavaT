package com.Day08.exception;

public class ExceptionTest02 {
    public static void main(String[] args) {
        NullPointerException e=new NullPointerException("空指针异常");//没有抛出    并不会停止运行      这里只是一个单纯的类对象
        System.out.println("hello word");
        String msg = e.getMessage();
        System.out.println(msg);
        e.printStackTrace();   //java 后台打印异常信息     采用异步线程的方式打印
    }
}
