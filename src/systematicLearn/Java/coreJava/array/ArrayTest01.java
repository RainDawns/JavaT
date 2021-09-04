package systematicLearn.Java.coreJava.array;

import com.Day07.User;


import java.util.Arrays;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/2 14:20<br/>
 *
 * @author lnh<br />
 */
public class ArrayTest01 {

    public static void main(String[] args){
        int[] a1=new int[]{1,23,4,5,};
        int[] a2=new int[5];
        a2[4]=19999;
        int[] a3={121,232,4234,23423,4};

        //测试简单返回数组
        int[] m = m();
        int[] m12=m(new User(),new User(),new User());
        System.out.println("*******************************");
        System.out.println(Arrays.toString(m12));
        for (int i = 0; i <m.length; i++) {
            System.out.println(m[i]);
        }
        //数组拷贝
        System.arraycopy(m,0,a2,0,m.length);
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
        //测试工具类java.util.arrays
        //变成对应的String形式
        System.out.println(Arrays.toString(a2));
        //数组复制
        Arrays.copyOf(a2,20);
        System.out.println(a2.length);    //5
        //数组排序

        Arrays.sort(a2);
        //字符拼接使用StringBuilder  防止过多的字符放在常量池   优化内存
        System.out.println(Arrays.toString(a2));
        //查找数组当中的某一值返回其下标
        int index = Arrays.binarySearch(a2, 19999);
        System.out.println(index);
    }
    public static int[] m(User... ar){
        int a=5;
        int b=6;

        return new int[]{a,b};
    }
}
