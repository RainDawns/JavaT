package com.Day06;
/*
* 冒泡排序
*通过每次变动的还需要比较的次数来控制每次每个数的比较次数
* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a={12,4,344,545,66,7,689,94,2,13,12};
        for (int i = a.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j]>a[j+1]){
                    int x=a[j+1];
                    a[j+1]=a[j];
                    a[j]=x;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
