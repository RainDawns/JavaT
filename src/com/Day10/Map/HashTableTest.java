package com.Day10.Map;

import java.util.Hashtable;
import java.util.Map;

/*
* HashTable  的key值可以为null吗？
*           不可以  且 values 也不可以为空
*
*初始化容量是11  加载因子是0.75
*      扩容 ：   2倍再加1
*
* */
public class HashTableTest {
    public static void main(String[] args) {
        Map map=new Hashtable();
        map.put(null,"778");

    }
}
