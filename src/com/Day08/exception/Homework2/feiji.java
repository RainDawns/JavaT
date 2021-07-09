package com.Day08.exception.Homework2;

public class feiji extends wuqi implements moveable,shotable{
    @Override
    public void move() {
        System.out.println("战斗机起飞");
    }

    @Override
    public void shot() {
        System.out.println("战斗机射击");
    }
}
