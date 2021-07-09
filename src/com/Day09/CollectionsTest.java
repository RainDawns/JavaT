package com.Day09;

import java.util.Collection;

/*
 *     Collections   以单个方式存储元素    继承    Iterable  接口(中有一个方法)      所有的集合都是可迭代
*
* map   以键值对方式来存储接口     spirng_ioc容器就是个map   存储key类名    地址    value
*
 */

public class CollectionsTest {
    /*
     * Collections    下面有两个接口    list    存取有序(不是大小排序)可重复 存储的元素有下标从0开始    可先进先出
     *                                                     set   无序不可重复  元素无下标
    *
    *
    *
    *list 接口  下面一堆的实现类    最主要学习三个    arraylist    底层数组    非线程安全的
    *                                                                               linkedlist 双向链表数据结构
    *                                                                               vector 数组这种结构    线程安全的    效率较低   使用较少
    *
    *
    *
    *
    * set   实现类     hashset     底层使用了  hashmap 集合         >>>>>采用 哈希表数据结构
    *                           下面接口    sortedset(大小可排序的)>>>>>>   实现类  treeset     底层是一个   treemap  集合 >>>>>> 采用 二叉树数据结构
    * */






    /*
     * map    下有两个常用实现类   哈希表数据结构    一个泛化接口   sortedmap(大小可排序的)   >>>>下面有一个实现类   treemap(二叉树 )
    *         其中 所有的key无序不可重复  和set集合存储元素特点一样
    *   hashmap     非线程安全
    * hashtable        线程安全   >>>>>>  子类  properties   线程安全的    采用key与value只能都是string类型      就是属性类
    *
    *
    * */
}
