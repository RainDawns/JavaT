package jiepu.Java.coreJava.array;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/2 14:42<br/>
 *
 * @author lnh<br />
 */
public class ArrayTest02 {
    public static void main(String[] args) {

        int maxNum = MaxNum(new int[]{123, 324, 434, 234, 2345, 3, 54, 35, 6345, 634, 65, 756, 78, 558});
        System.out.println(maxNum);


    }


    public static int MaxNum(int[] arr){
        /**
         * @description:   返回某一数组的最大值
         * @author:  lnh
         * @date: 14:44
           * @param arr  传入的数组
         * @return: int   返回的数值
         */
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
