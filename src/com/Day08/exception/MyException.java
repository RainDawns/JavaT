package com.Day08.exception;
/*
* java中 自定义的异常
*
*
* */
public class MyException  extends  Exception{//编译时异常    通过发生频率来改变继承的类    发生的少 选运行时异常
    public MyException(){

    }
    public  MyException(String s){
        super(s);
    }

}
