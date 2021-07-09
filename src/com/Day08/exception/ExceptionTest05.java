package com.Day08.exception;
/*
*
* 先执行 sout
* 在执行System.out.println("hello");
* 最后执行  return
*
* finally  关键字中 的代码 一定会执行
*
*
* */
public class ExceptionTest05 {
    public static void main(String[] args) {
        try {
            System.out.println("fhsdfsduf");
            return;
        }finally {
            System.out.println("hello");
        }
    }
}
