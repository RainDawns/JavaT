package jiepu.Java.coreJava.array;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/2 18:22<br/>
 *
 * @author lnh
 */
public class ArrayTest06 {
        /*
        思路：
        p <- Get a number from array
        Loop if left < right
        Put elements <= p to the left side
        Put elements >= p to the right side
        Recursive quickSort the left parts and right parts
         */
        public static void quickSort(int[] arr, int head, int tail) {
            int start = head;
            int end = tail;
            int pivot = arr[head];
            while (start < end) {
                //从后往前开始比较
                while (end > start && arr[end] >= pivot)//如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                    end--;
                if (arr[end] <= pivot) {
                    int temp = arr[end];
                    arr[end] = arr[start];
                    arr[start] = temp;
                }
                //从前往后比较
                while (end > start && arr[start] <= pivot)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置，然后又从后往前比较
                    start++;
                if (arr[start] >= pivot) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                }
                //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
            }
            //递归
            if (start > head)
                quickSort(arr, head, start - 1);
            if (start < tail)
                quickSort(arr, end + 1, tail);
        }

        public static void main(String[] args) {
            int array[] = {1, 66, 88, 22, 3};
            quickSort(array, 0, array.length - 1);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

}
