package systematicLearn.Java.homework.Day13;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/17 17:02<br/>
 *
 * @author lnh<br />
 */
public class CollectionTest02 {
    public static void show(Collection<? extends Number> c) {
        /*        System.out.print("{");*/
        for (Number o : c) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Collection<Byte> c = new ArrayList<>();
        c.add((byte) 1);
        c.add((byte) 21);
        c.add((byte) 32);
        show(c);
    }
}
