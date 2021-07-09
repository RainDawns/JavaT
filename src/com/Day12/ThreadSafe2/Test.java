package com.Day12.ThreadSafe2;

public class Test {
    public static void main(String[] args) {
        Acconut act=new Acconut("01",10000);
        Thread t1=new Thread(new ThreadAcconut(act));
        Thread t2=new Thread(new ThreadAcconut(act));
        t1.setName("t1");
        t2.setName("t2");
        t2.start();
        t1.start();
    }
}
