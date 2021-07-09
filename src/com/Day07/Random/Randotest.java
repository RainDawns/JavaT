package com.Day07.Random;

import java.util.Random;

public class Randotest {
    public static void main(String[] args) {
        //生成一个random对象
        Random random=new Random();
        //生成一个长度为5的数组
        int[] a=new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]=-1;
        }
        //设置一个下标来表示完成数组中的哪一个元素
        int index=0;
        //赋值
        while (index<a.length){
            int num =random.nextInt(7);
            System.out.println("生成的随机数是"+num);
            if(!shuzu(a,num)){
                a[index]=num;
                index++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    /*
    * 方法用来判断数字是否在数组中   通过返回类型
    * */
    public static boolean shuzu(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
}
