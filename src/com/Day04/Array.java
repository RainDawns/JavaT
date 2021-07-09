package com.Day04;
/*
* **************************数组为啥检索速度快
* 数组在内存上存储连续
* 数组可以通过下标查找值
* 每个数组大小一样
* */
public class Array {
    public static void main(String[] args) {
        /*
        * 第一种为静态初始化
        * 第二种为动态化
        * */

        int[] a = {1,23,43,4,545};
        System.out.println(a.length);
        System.out.println(a[a.length - 1]);
        int[] array=new int[7];
        /*
            数组拷贝
         */
        System.out.println("*****数据拷贝");
        System.arraycopy(a,0,array,0,5);
        for (int j=0;j<a.length;j++){
            System.out.println(array[j]);
        }
        System.out.println("*****数组类型为类");

        ca[] ca= {new ca(),new b()};
        for (int i=0;i< ca.length;i++){
            ca[i].move();
        }

    }
    public static class ca{
            public void move(){
                System.out.println("1");
            }
    }
    public  static class b extends ca{
        public void move(){
            System.out.println("2");
        }
    }
}
