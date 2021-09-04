package systematicLearn.Java.coreJava.array;

import java.util.Arrays;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/2 16:14<br/>
 *
 * @author lnh<br />
 */
public class ArrayTest04 {
    /*
     *排序外层时，经常不需要考虑最后一个   因为前面的数字排好了，剩下的也就直接排好了
     * 选择排序
     *
     *核心思想：每次寻找待排序的区域的最小值  然后将其放在之前待排序区域的第一位   然后待排序区就会减少长度   以此往下   反复执行  就可以将所有数字排序完成
     * */
    public static void main(String[] args) {
        int[] selectionsort = sSort(new int[]{131, 2423, 12, 123131, 435, 45, 435, 75689, 789635534, 534, 54234, 32, 23});
        System.out.println(Arrays.toString(selectionsort));
    }

    //注意，操作的核心目标：
// 1.每轮找到的最小值应该存放的下标位置是什么
// 2.每轮找到的最小值现在的下标位置是什么
// 3.找到之后，让这俩个位置的值进行交互就可以了
// 4.注意，最后一个数字就不用在比较了（前面都排好了，最后一个一定是最大的）
    public static int[] selectionsort(int[] arr) {
        //数组的长度
        int len = arr.length;
        //min_now_index表示最小值【当前】在什么位置
        int min_now_index;
        //min_should_index表示最小值【应用】在什么位置
        int min_should_index;
        //外层循环，控制一共要比较多少轮，同时这个变量i，刚好是每轮我们需要指定的最小值应该存放置。
        for (int i = 0; i < len - 1; i++) {
            //每一轮i的值，刚好就是本轮最小值应该存放的位置。
            min_should_index = i;
            //假设当前i的位置就是本轮最小值的实际位置
            min_now_index = i;
            //内层循环，负责每轮找出当前未排序区中的一个最小值的实际位置的下标
            for (int j = i + 1; j < len; j++) {
                //哪个数据小，就把这个数据下标赋值给min_now_index
                // 目的是让了min_now_inde始终x变量中保持当前未排序区中的最小值的位置
                if (arr[j] < arr[min_now_index]) {
                    min_now_index = j;
                }
            }
            //内层循环结束后，就明确了当前未排序区中的最新值的下标，以及这个最小值应该存放在什么位置
            //接下来可以进行交互位置
            if (min_now_index != min_should_index) {
                int temp = arr[min_now_index];
                arr[min_now_index] = arr[min_should_index];
                arr[min_should_index] = temp;
            }
        }
        return arr;
    }


    /*
     *
     * 自写的
     *
     */
    public static int[] sSort(int[] arr) {
        int cnum;
        for (int i = 0; i < arr.length; i++) {
            cnum = i;
            int min_num = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min_num] > arr[j]) {
                    min_num = j;
                }
            }
            if (min_num != i) {
                int tmp = arr[cnum];
                arr[cnum] = arr[min_num];
                arr[min_num] = tmp;
            }
        }
        return arr;
    }
}
