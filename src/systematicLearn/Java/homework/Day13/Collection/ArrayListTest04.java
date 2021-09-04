package systematicLearn.Java.homework.Day13.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 16:24<br/>
 *
 * @author lnh<br />
 */
public class ArrayListTest04 {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(12);
        l.add(32);
        l.add(12312);
        l.add(768);
        l.add(1435);
        l.add(976);
        Iterator iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
