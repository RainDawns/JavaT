package com.Day10;

/*
* JDK5.0之后新特性
*
* */
public class ForEachTest {
    public static void main(String[] args) {
        int[] s= {1,23,2,423,4,35,345,4,6,7,567,86} ;
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        //语法格式   增强for   需要下标的不建议使用
        /*for (元素类型   变量名:数组或集合
             ) {
        }*/
        for (int data:s
             ) {
            System.out.println(data);
        }
    }
}
