package com.Day06;
/*
* select sort  选择排序    效率大于冒泡排序    交换、循环次数少   且交换位置时是有意义的
*
*
* */
public class selectsort {
    public static void main(String[] args) {
        int[] a={21,2,312,43,45,65};
        for (int i = 0; i < a.length-1; i++) {
            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                if(a[j]<a[min]){
                    int tmp=a[min];
                    a[min]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
