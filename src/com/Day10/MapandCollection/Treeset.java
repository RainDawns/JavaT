package com.Day10.MapandCollection;

import java.util.TreeSet;

/*
* 自定义类型放入集合中的话  需要加比较器     一个传入自定义比较器   一个是自定义类继承接口
*
* 编写比较器可以改变升序与降序
* */
public class Treeset {
    public static void main(String[] args) {
        TreeSet<x> set=new TreeSet();
        set.add(new  x(6578));
        set.add(new x(567890));
        for (x t:set
             ) {
            System.out.println(t);
        }
    }
    static class x implements Comparable{
        private int age;

        public x(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "x{" +
                    "age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            x x1= (x) o;
            return this.age- x1.age;
        }
    }
}
