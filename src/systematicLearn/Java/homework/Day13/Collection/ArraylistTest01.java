package systematicLearn.Java.homework.Day13.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/15 19:35<br/>
 *
 * @author lnh<br />
 */
public class ArraylistTest01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer o : list) {
            System.out.println(o);
        }
    }
}
