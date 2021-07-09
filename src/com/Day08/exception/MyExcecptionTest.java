package com.Day08.exception;

public class MyExcecptionTest {
    public static void main(String[] args) throws MyException {  //上抛异常   反馈给jvm
        MyException myException=new MyException("用户名用不了哦");

        System.out.println("djsfhis");
        throw  myException;//自己手动抛异常  也可以是 程序结束 ==return >>>>> 退出jvm


        //main 方法中 一般使用   try catch     以前出现  异常  打印或者输出啥
        //
        //现在改成  自己创建 异常   .>>>>>>然后发生错误自己手动抛异常       >>>> 以后都使用这种方法  谢谢
        //重写方法时  不能抛出更多或者范围更大的异常       只能同等范围的  或者更小的范围的异常   或者不抛

    }

}
