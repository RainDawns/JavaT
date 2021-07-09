package com.Day08.exception.Homework2;

public class youting extends wuqi implements shotable,moveable{
    @Override
    public void move() {
        System.out.println("游艇开动");
    }

    @Override
    public void shot() {
        System.out.println("游艇射击");
    }
}
