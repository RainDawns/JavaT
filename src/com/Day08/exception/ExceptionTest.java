package com.Day08.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
*
* catch  可以写多个     可以精确解决
* 从上到下   从小到大
*
*   JDK8 新特性  FileNotFoundException | NullPointerException e)
*
* */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            FileInputStream file=new FileInputStream("C:\\Users\\lnh\\Desktop\\" +
                    "000_动力节点_Java零基础_课堂笔记\\课堂笔记\\day-课程随笔.txt");
            System.out.println("11111");
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到");
        }
    }
}
