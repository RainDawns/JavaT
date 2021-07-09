package com.Day10.Map;

import java.util.TreeSet;

/*
* treemap底层是一个二叉树
* treeset集合中的元素等同于  放在treemap中key 部分的元素
* treeset  无序不可重复   但是可排序  称为可排序集合
*   无法对自定义的类型排序  但可以指定规则
* */
public class TreeMapTest {

    public static void main(String[] args) {
        TreeSet<String> set =new TreeSet<>();
        set.add("tzdsgfyui");
        set.add("trytyughvj");
        for (String x:set
             ) {
            System.out.println(x);
        }
    }
    /*
    * 数据库中有很多数据
    *
    * */
}

