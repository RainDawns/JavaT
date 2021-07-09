package com.Day05;

public class Teststack {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        System.out.println("+++++++++++++++========");
        Object obj=stack.POP();
        System.out.println(obj);
        System.out.println(stack.POP());
        System.out.println(stack.POP());
    }

}
