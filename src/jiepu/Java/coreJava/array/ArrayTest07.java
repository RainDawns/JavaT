package jiepu.Java.coreJava.array;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/3 9:16<br/>
 *
 * @author lnh<br />
 */
public class ArrayTest07 {
    int[] arr;
    public static void main(String[] args) {
        ArrayTest07 at=new ArrayTest07();
        System.out.println(at.arr); //实例变量的定义   初始化    对数组本身做了初始化；
        int[] arr2=null;
        System.out.println(arr2);  //引用变量默认值都是null   且引用类型可以直接赋值null；



        double[] arr={87,97,43,23,34,56,67,65,8,78};
        System.out.println(avg(arr));
        /*
       *
       *
       * */


    }
    public static int avg(double[] arr){
        double sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        int result=(int)(sum/arr.length);
        return result;
    }
}
