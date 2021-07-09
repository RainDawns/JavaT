package jiepu.Java.coreJava.Test;

import java.util.stream.Stream;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/4 16:08<br/>
 *
 * @author lnh<br />
 */
public class Test07 {

    /*
    * 第一种方法实现
    *
    * */
   /* public static void main(String[] args) {
        Test07 te=new Test07();
        te.shuChu();
    }
    public void shuChu(){
        int[] arr=new int[10];
        arr[0]=arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }*/


    /*
    *
    *
    *
    * */

    int num=1;
    int num1=1;
    public void shuChu(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(num+",");
            System.out.print(num1+" ,");
            num=num+num1;
            num1=num+num1;
        }
    }

    public static void main(String[] args) {
/*
        Test07 te=new Test07();
        te.shuChu(6);
*/


        //
        Stream.iterate(
                new long[]{0, 1}, a -> new long[]{a[1], a[0] + a[1]})
                .limit(10)
                .map(a -> a[1] + ",")
                .forEach(System.err::print);
    }
}


