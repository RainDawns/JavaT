package com.Day03;
/*
* 抽象类是用来被继承  不能实例化    有构造方法供子类使用
*不一定有抽象方法 但是抽象方法一定在抽象类中
* 非抽象类实现抽象方法必须覆盖或者重写
*
*
* */
public class Abstract {
    public static void main(String[] args) {
        test1 test2=new test1();
        test2.m();

    }
}
    abstract class test{
        public abstract void m();
    }
    class  test1 extends testyou {
        public  void  m(){
            System.out.println("继承和重写");
        }

    }


