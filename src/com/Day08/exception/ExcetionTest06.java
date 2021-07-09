package com.Day08.exception;
/*
* finally
*
* */
public class ExcetionTest06 {
    public static void main(String[] args) {
        try {
            System.out.println("dfbhsdjf");
            System.exit(0);//退出之后  finally  之后的代码不执行

        }finally {
            System.out.println("finally  执行了");
        }
    }
//    public static void main(String[] args) {
//        int result=a();
//        System.out.println(result);
//    }
    /*
    * java 语法规则
    * 1.方法体中的代码  必须自上而下执行 依次执行        这是不会变的、
    *2.return 一旦执行，整个方法结束
    *出现的问题：   造成前面的return代码并没有运行   而是被后面覆盖
    *
    * 方法中的代码必须从上到下执行   这是永远不会变的
    * return 一旦执行，整个方法结束
    *
    * */
    public static int a(){
    int i=10;
    try {
        return i;
    }finally {
        System.out.println("“污染");
        return 100;
    }
    }
}
