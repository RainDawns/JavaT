package jiepu.Java.homework.Day13.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/15 19:53<br/>
 *
 * @author lnh<br />
 */
public class ArrayListTest03 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("test");
        list.add("test1");
        list.add("test");
        list.add("you");
        list.add("you1");
        list.add("you");
        List<String> list1=new ArrayList<String>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String o= iterator.next();
            if (!list1.contains(o)){
                list1.add(o);
            }
        }
        System.out.println(list1);
    }
}
