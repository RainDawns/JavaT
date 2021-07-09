package com.Test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/1 21:47<br/>
 *
 * @author lnh<br />
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println(-5<<2);
        /*
        0000 ..... 0000 0101
        1111 ..... 1111 1010
        1111  .... 1111 1011
        1111  .... 1110 1100
        1111  .... 1110 1011
        0000 ..... 0001 0100  >>>>>20
        -20


        */

        System.out.println(-5>>2);


        System.out.println(-5>>>2);
        /*
        1000 .... 0000 0101
    反码    1111 .... 1111 1010
    补码    1111 .... 1111 1011
    操作    0011 .... 1111 1110
        00111111111111111111111111111110  >>>>1073741822


        */
    }
}
