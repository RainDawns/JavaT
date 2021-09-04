package systematicLearn.Java.homework.Day13.Collection;

import java.util.Comparator;

import java.util.Set;
import java.util.TreeSet;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 16:40<br/>
 *
 * @author lnh<br />
 */

/*
* treesset  在传入
* hashset
*
*
* */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 1 && o2 % 2 == 0) {
                    return -1;
                } else if (o1 % 2 == 0 && o2 % 2 == 1) {
                    return 1;
                } else if (o1 % 2 == 0 && o2 % 2 == 0) {
                    return o2 - o1;
                } else if (o1 % 2 == 1 && o2 % 2 == 1) {
                    return o1 - o2;
                }
                return 0;
            }
        });
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(7);
        set.add(6);
        set.add(9);
        set.add(1);
        set.add(0);
        set.add(8);
        set.add(5);
        for (Integer o : set) {
            System.out.print(o);
            System.out.print(" ");
        }


    }
}
