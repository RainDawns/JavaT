package com.day1;
/*
* 枚举使用  举例小练手
*
*
* */
public class b {
    enum xguang{
        a,b,c;
    }

    public static void main(String[] args) {
        for (xguang x: xguang.values()) {
            System.out.println(x);
        }
        System.out.println(xguang.a);
    }
}
