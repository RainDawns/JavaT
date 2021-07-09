package com.Day03;
public class finaltest {
    public static void main(String[] args) {
    /*final A a=new A(30);
        a.age=45;
        System.out.println(a.age);*/
        System.out.println(A.ADNG);
    /*
    * final 引用的对象
    * 引用的对象地址不能改变  但是对象内的数据可以改变
    *final 修饰的类不能被继承 方法不允许覆盖 常量必须手动赋值或者方法中赋值：this.常量=代数;
    * 修饰的实例变量 一般为 public staic final String AS="hsdfu";   称为常量
    *
    * */
        /*
        * *********************final修饰的不能变****************
        * */

    }
    public static class A{
        private int age;
        public  static final String ADNG="水浇地";
        public A() {
        }

        public A(int age) {
            this.age = age;
        }
    }

}
