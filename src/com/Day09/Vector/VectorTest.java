package com.Day09.Vector;
/*
*vector 底层是数组  初始化容量是10
*       扩容之后之前容量的2倍
*       方法都是线程安全  含synchronized  关键字   使用较少
* */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
* 如何将arraylist 从线程不安全的变为安全的
*                   集合工具类    collections
*
*
* */
public class VectorTest {
    public static void main(String[] args) {
        List mylist =new ArrayList();//线程不安全的
        Collections.synchronizedList(mylist);//线程安全
        mylist.add("7eryhsdfashfgd");
        mylist.add(78);
        Iterator iterator = mylist.iterator();
        System.out.println(iterator.next());
    }
}
