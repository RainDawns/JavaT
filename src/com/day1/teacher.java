package com.day1;

public class teacher extends people{
    public void write(){
        System.out.println(name+"+"+age);
    }

    public static void main(String[] args) {
        teacher teacher=new teacher();
        teacher.setName("刘飞");
        teacher.setAge(45);
        teacher.write();
    }
}
