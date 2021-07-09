package com.Day10.Map;

import java.util.Comparator;
import java.util.TreeSet;

/*
* 自带比较器   构造  treeset时传入比较器  使用比较器的方式
*    一种 元素类继承比较器   java.lang包下的
*    一种是定义比较器类实现比较接口   java.util包下的     或者不定义  直接通过匿名内部类    直接传入
*           如何选择呢    当规则不会经常性的更改 或者和只有一个规则时  选择继承java.lang包下的compare
*            反之  则选择  另一种  自定义比较器
*
* */
public class TreesetTest03 {
    public static void main(String[] args) {
        TreeSet<testyou> map=new TreeSet<>(new Youcompare());
        map.add(new testyou(567));
        map.add(new testyou(89));
        for (testyou t:map
             ) {
            System.out.println(t);
        }
    }
    static class  Youcompare implements Comparator<testyou>{
        @Override
        public int compare(testyou o1, testyou o2) {
            return o1.age-o2.age;
        }
    }
    static class testyou{
        private  Integer age;

        public testyou(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "testyou{" +
                    "age=" + age +
                    '}';
        }
    }
}
