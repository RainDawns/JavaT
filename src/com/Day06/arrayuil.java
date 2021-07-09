package com.Day06;

import java.math.BigDecimal;

/*
* 二分查找
* */
public class arrayuil {
    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(10.134134);
        System.out.println(bigDecimal);
        int[] a={23,34,54,65,343,2325};
        int index=searchtwo(a,34);
        System.out.println(index== -1 ? "该数不存在" : "该数的下标是"+index);
    }

    public static int searchtwo(int[] a, int i) {
        int begin = 0;
        int end = a.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (a[mid] == i) {
                return mid;
            } else if (a[mid] < i) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

