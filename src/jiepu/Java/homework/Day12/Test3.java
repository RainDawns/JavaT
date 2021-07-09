package jiepu.Java.homework.Day12;

import java.util.Scanner;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/11 17:15<br/>
 *
 * @author lnh<br />
 */
public class Test3 {
    public static void count(String str){
        int count1=0;
        int count2=0;
        char[] array=str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int x=(int)array[i];
            if ((x>64&&x<91)||(x>96&&x<123)){
                count2++;
            }
        }
        count1=array.length-count2;
        System.out.println("数字共有："+count1+"个");
        System.out.println("字母共有："+count2+"个");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        count(str);
    }
}
