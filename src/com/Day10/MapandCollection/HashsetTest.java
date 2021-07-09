package com.Day10.MapandCollection;

import java.util.HashSet;
import java.util.Iterator;
/*
* 自定义类型放在到set中时需要重写equals方法
*
* */
public class HashsetTest {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("tryuhijk");
        set.add("45etryghfc");
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
