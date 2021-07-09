package com.Day10.Map;

import java.util.TreeSet;
/*
* treemap  底层排序的时候  是调用的compareto    所以当你要将该元素使用treeset集合时
*  看具体需求来来看按啥排序     首先  要放入treeset的元素类型  的类  应该继承  比较类  然后重写 方法  即可    返回值就是  int 类型
*                        string 字符串可以调用compareto 方法  因为  string 类已经重写了该方法
*
* 这里使用的时白平衡二叉树
*
* */
public class TreeSetTest02 {
    public static void main(String[] args) {
        User u1=new User(23);
        User u2=new User(34);
        User u3=new User(57);
        TreeSet<User> set =new TreeSet<>();
        set.add(u1);
        set.add(u3);
        set.add(u2);

        for (User u:set
             ) {
            System.out.println(u);
        }

    }
    static class User implements  Comparable{
        private Integer age;

        public User(Integer age) {
            this.age = age;
        }

        /*
        *
        * 控制返回值来改变treeset 的升序或者降序排序     >>>>
        * */
        @Override
        public int compareTo(Object o) {
            User U= (User) o;
            return this.age- U.age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    '}';
        }
    }
}
