package com.Day08.exception;
/*
* finally 关键字    必须和try  一起使用
*  finally中的代码是一定会执行的   即使   try 中  发生了错误      通常是资源的释放
*
*
*
* */
public class ExceptionTest04 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally ");
        }
    }
    public  static  void  m1() throws Exception{

    }
}
