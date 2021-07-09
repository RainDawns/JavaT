package jiepu.Java.homework.Day13.Collection;

import java.util.HashSet;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/15 20:30<br/>
 *
 * @author lnh<br />
 */
public class HashSetTest02 {
    /*
    * retainAll 和removeAll的
    * */
    public static void main(String[] args) {
        HashSet set1=new HashSet();
        HashSet set2=new HashSet();
        set1.add(12);
        set1.add("7dfysugfds");
        set1.add("you");
        set1.add(342);
        set1.add("test");
        set2.add(65);
        set2.add(12);
        set2.add("7dfy54sugfds");
        set2.add("you");
        set2.add(34452);
        set2.add("te5st");
        set2.add(6546);
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
