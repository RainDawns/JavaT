package jiepu.Java.homework.Day13.Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/15 19:40<br/>
 *
 * @author lnh<br />
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        Set set=new HashSet();
        while (set.size()<10){
            set.add(new Random().nextInt(20)+1);
        }
        System.out.println(set);

    }

}
