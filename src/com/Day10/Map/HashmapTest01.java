package com.Day10.Map;

public class HashmapTest01 {
    public static void main(String[] args) {
        Student s1=new Student("张三");
        Student s2=new Student("张三");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
