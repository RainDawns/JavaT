package jiepu.Java.coreJava.array;

import java.util.Arrays;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/2 16:25<br/>
 *
 * @author lnh<br />
 */



public class ArrrayTest05 {
    /*\
    *
    * 插入排序
    *
    *
    * */
    public static void main(String[] args) {
        int[] insertionsort = iSort(new int[]{131, 2423,123,12,1,4,134,134,13,413,4234, 32, 23});
        System.out.println(Arrays.toString(insertionsort));
    }

    public static  int[]  insertionsort(int[]  arr){
        System.out.println(Arrays.toString(arr));
        //当前在右边拿到的第一个要进行操作的数据
        int currentValue;
        //需要把数据在左边插入的位置
        int insertPosition;
        //外层循环，控制比较的轮数
        //同时，变量i的值，还是每一轮我们要操作的右边第一个数字的下标
        for(int i=1;i<arr.length;i++){
            //提前保存好我们当前要操作的值
            currentValue = arr[i];
            //假设当前变量i的值就是要插入的位置，因为这个数据有可能是原位置不动的。
            insertPosition = i;
            //内存循环，控制每轮比较的次数,以及比较的顺序
            //同时，变量j的值，还是左边数据中从大到小的下标值
            //例如：1 2 4 8 9 | 5 3 这个时候
            //我们拿着数字5 要依次和左边的9 8 4 2 1 比较
            //9 8 4 2 1的下标顺序就是 3 2 1 0 ，这就是j的值的变化规律
            for(int j=i-1;j>=0;j--){
                //每次比较，如果发现arr[j]比当前要操作的数字大
                if(arr[j]>currentValue){
                    //就把这个大的数字往后移动一个位置，就是往后赋值
                    arr[j+1] = arr[j];
                            //然后记录一下这个位置，因为这个位置很可能是要插入的位置，到底是不是这个位置，需要和下一个数字比较后才知道
                            insertPosition = j;
                }else{
                    //如果发现一个比currentValue值还小的值，那么这个值的上一个比较的位置就是我们要找的插入的位置，结束当前循环
                    break;
                }
            }
            //内层循环结束后，把当前要操作的值currentValue，插入到指定位置insertPosition
            //如果insertPosition和当前i值相等，说明当前操作的这个值currentValue是不需要移动的。
            if(insertPosition != i){
                //进行值的插入
                //把当前右边第一个值（正在操作的值），插入到左边合适的位置
                arr[insertPosition] = currentValue;
            }
            //输出每一轮排序的过程
            System.out.println("\t"+ Arrays.toString(arr));
        }

       return arr;
    }





    public static int[] iSort(int[] arr){
        int cnum;
        int shouldnum;
        for (int i = 1; i <arr.length ; i++) {
            cnum=arr[i];
            shouldnum=i;
            for (int j = i-1; j >=0 ; j--) {
                if (cnum<arr[j]){
                    arr[j+1]=arr[j];
                    shouldnum=j;
                    //下面break可以减少一些循环
                }else {
                    break;
                }
            }
            if(shouldnum!=i){
                arr[shouldnum]=cnum;
            }
        }
        return arr;
    }
}
