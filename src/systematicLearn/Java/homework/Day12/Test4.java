package systematicLearn.Java.homework.Day12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/11 19:25<br/>
 *
 * @author lnh<br />
 */
public class Test4 {
/*    public static Action m1(){
        return new Action() {
            @Override
            public String[] test(String str) {
                String[] strings = str.split("\\|");
                return strings;
            }
        };
    }
    public static Action m2(){
        return new Action() {
            @Override
            public String[] test(String str) {
                String[] strings = str.split("-");
                return strings;
            }
        };
    }*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nextInt = sc.nextInt();
        if (nextInt==1){
            String str = sc.next();
            Action a= new Action() {
                @Override
                public String[] test(String str) {
                    String[] strings = str.split("\\|");
                    return strings;
                }
            };

            String[] arr=a.test(str);
            System.out.println(Arrays.toString(arr));
        }else {
            String str = sc.next();
            Action a=new Action() {
                @Override
                public String[] test(String str) {
                    String[] strings = str.split("-");
                    return strings;
                }
            };
            String[] arr=a.test(str);
            System.out.println(Arrays.toString(arr));
        }

    }
}
interface Action{
    public String[] test(String str);
}

