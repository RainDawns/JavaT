package com.Day07;
/*
* 字符串的拼接
* 对比两中的区别
* StringBuffer 中的方法都有synchronized关键字修饰   表示在多线程下运行都是安全的
* builder  >>>>>>>非线程安全
* */

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer str1=new StringBuffer();
        java.lang.StringBuffer str =new java.lang.StringBuffer();
        str.append(65);
        System.out.println(str);

        //指定初始化容量为1000的StringBuffer对象
        java.lang.StringBuffer stringBuffer=new java.lang.StringBuffer(1000);

        System.out.println("===================**************************");
        StringBuilder str12=new StringBuilder();
        str1.append("dcbhsdj");
        System.out.println(str1);


    }
}
