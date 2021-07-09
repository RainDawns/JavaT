package jiepu.Java.coreJava.Test;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/3 15:10<br/>
 *
 * @author lnh<br />
 */
public class Test06 {
    public static void main(String[] args) {

/*        int seach = seach(arr,num);
        if (seach>=0){
            System.out.println(seach);
        }else {
            System.out.println("不存在");
        }*/

        //shuChu();
        //newTest();
        //suiJi();
        String s="";
        float aFloat = new Random().nextFloat()*1000;
        System.out.println(aFloat);
    }
    public static  int  seach() {
        /*
         *
         * 随机生成一个int 数组    然后输入一个数  查找有则返回下标  无则输出不存在
         *
         * */
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);

        }

        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==num){
                System.out.println(i);
                return i;
            }else if (i== arr.length-1){
                System.out.println("不存在");
            }
        }
       /* int binarySearch = Arrays.binarySearch(arr, num);
        System.out.println(binarySearch);
        if (binarySearch > -1) {
            return binarySearch;
        } else{
            System.out.println("不存在");
        }*/
        return -1;
    }
    public static void newTest(){
        /*
        * 创建一个[1,100]之间的数，长度为10的数组
        * */
        int[]  arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100+1);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void yanZheng(){
        /*
        * 返回一个四位数验证码
        * */
        String s="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
        char[] chars = s.toCharArray();
        System.out.println(chars[new Random().nextInt(s.length())]+""+chars[new Random().nextInt(s.length())]+chars[new Random().nextInt(s.length())]+chars[new Random().nextInt(s.length())]);
    }
    public static void suiJi(){
        String[] str={"13089327832","13489236745","19908327923","13345327832","13489234553445","195348327923"};
        int index=new Random().nextInt(str.length);
        System.out.println(str[index]);
    }

    public static void tongJi(){
        int[] arr=new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(new Random().nextInt(6))+1;
        }
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]){
                case 1:
                   count1++;
                   break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
                case 6:
                    count6++;
                    break;
            }
        }
        System.out.println("1的个数"+count1);
        System.out.println("2的个数"+count2);
        System.out.println("3的个数"+count3);
        System.out.println("4的个数"+count4);
        System.out.println("5的个数"+count5);
        System.out.println("6的个数"+count6);
    }

    public static void shuChu(){
        for (int i = 32; i < 127; i++) {
            char c=(char)i;
            System.out.print(c+" ");
        }
    }
}
