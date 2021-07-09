package jiepu.Java.coreJava.array;

import java.util.Arrays;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/2 14:48<br/>
 *
 * @author lnh<br />
 */
public class ArrayTest03 {
    /*
    *
    * 冒泡排序  实例以及解释  理解
    *
    *   [3, 4, 4, 13, 14, 413, 423, 1241, 4134, 4134, 12312, 213123, 563645, 2354534]

     * 从左往右   两两比较     最大往后面走
    * */
    public static void main(String[] args) {
        int[]  result=Bsort(new int[]{213123,12312,413,4134,14,13,4,3,423,4,1241,4134,2354534,563645});
        System.out.println(Arrays.toString(result));

    }
    public static int[]   BubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =0; j < (arr.length-i-1) ; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        return arr;
    }

    public static int[] Bsort(int[] arr){
        for (int i = arr.length-1; i >0; i--) {
            for (int j = 0; j <i ; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }









}
