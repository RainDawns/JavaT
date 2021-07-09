package com.Day11;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class shujuliuTest {
    public static void main(String[] args) throws FileNotFoundException {
        //创建数据专属得字节流
       // DataOutputStream dos=new DataOutputStream(new FileOutputStream("data")); 写入时私用不同类型
        //读出的时候  必须按写入得顺序得读出  所以一般很少使用
        ///*
        // println 输出就是    PrintStream 类    标准输出流不需要关闭    输出方向可以改变
            //可以使用来写一个日志文件类
        // */

        /*
        * 输出流可以使用flush方法,将管道内的数据全部清空   不使用的话数据有可能丢失
        * 一般输出和输入的话，都需要close方法  将已经不需要的资源释放掉
        *
        *
        *
        * */
        System.out.println("gyuefwe");
        PrintStream pt=new PrintStream(new FileOutputStream("test1",true));//使用追加的方式   <<<<<true
        System.setOut(new PrintStream(pt));
        System.out.println("shabi ");
        System.out.println(768);
    }
}
