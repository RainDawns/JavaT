package jiepu.Java.homework.Day13.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/15 19:44<br/>
 *
 * @author lnh<br />
 */
public class ArrayListTest02 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<Integer>();
        while (list1.size()<20){
            list1.add(new Random().nextInt(100));
        }
        List<Integer> list2=new ArrayList<Integer>();
        for (Integer o: list1) {
            if (0 == o% 2){
                list2.add(o);
            }
        }
        for (Integer o: list2) {
            System.out.print(o);
            System.out.print("  ");
        }
    }
}
