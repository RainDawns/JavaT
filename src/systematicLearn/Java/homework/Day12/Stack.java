package systematicLearn.Java.homework.Day12;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/11 19:57<br/>
 *
 * @author lnh<br />
 */
public class Stack {
    private int[] arr;
    int num = 0;

    public Stack(int length) {
        this.arr = new int[length];

    }

    public int push(int a) {
        if (num >= arr.length) {
            throw new IllegalArgumentException("栈已满");
        }
        arr[num] = a;
        num++;
        return -1;
    }

    public int pop() {
        if (num < 1) {
            throw new IllegalArgumentException("栈已空");
        }
        int i = arr[num - 1];
        arr[num - 1] = 0;
        num--;
        return i;
    }

    public int getSize() {
        return num;
    }

    public void show() {
        if (num == 0) {
            throw new IllegalArgumentException("栈为空");
        }
        System.out.print("[");
        for (int i = num - 1; i > -1; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push(5);
        s.push(67);
        s.push(53);
        s.push(64);
        s.push(23);
        s.push(62);
        s.push(59);
        s.push(34);
        s.push(13);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.getSize());
        s.show();
    }
}
