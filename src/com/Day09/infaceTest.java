package com.Day09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
*面向接口编程    类似于调包
*
* */
public class infaceTest {
    public static void main(String[] args) {
        List list=new ArrayList();//底层使用的是数组

        List list1=new LinkedList();//底层使用的是  双向链表
        //直接使用的是方法  不会关心里面属性   调用的是方法

    }
}
