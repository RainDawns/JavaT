package com.Day07.interger;
/*
* int integer  string   三种类型互相转换
*
*
* */
public class intergertest {
    public static void main(String[] args) {

        //string   >>>>>int
        String s="123";
        int i= Integer.parseInt(s);
        System.out.println(i+1);

        //int >>>string
        String s1=i+"";
        System.out.println(s1+1);

        //int >>>integer
        Integer x=10000;
        System.out.println(x+1);
        //integer >>>int
        int y=x;

        //string >>>>integer
        Integer k=Integer.valueOf("123");
        System.out.println(k+23432);
        //integer  >>>string
       String r= String.valueOf(k);
        System.out.println(r+23432);
    }
}
