package com.Day09.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
* 有序不可重复      有下标
*自己编写代码测试即可
* */
public class ListTest {
    public static void main(String[] args) {
        List list=new LinkedList();
        list.add(0,1);//用的比较少
        list.add(32);
        Iterator iterator = list.iterator();
        Object obj=list.get(1);
        System.out.println(obj);
        System.out.println(list.get(0));
        list.set(1,78);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
