package com.Day07.interger;
/*
* 8中基础数据提供  包装类     包装类为引用数据，继承object
* */
public abstract class interger {
    public static void main(String[] args) {
        inti inti=new inti(1023);
        dosome(inti);
        System.out.println("******************************");
        /*
        * 重点方法
        *
        * */
        int i = Integer.parseInt("123");
        System.out.println(i+1000);
    }

    public static void dosome(Object obj) {
        System.out.println(obj);
    }
}
