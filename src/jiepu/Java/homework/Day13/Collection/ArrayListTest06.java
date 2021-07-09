package jiepu.Java.homework.Day13.Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lnh
 * @date 2021年06月21日 9:50
 */
public class ArrayListTest06 {
    public static void main(String[] args) {
        MyTest<Integer> myTest=new MyTest<>();
        myTest.add(2342);
        myTest.add(324324);
        Iterator<Integer> iterator = myTest.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
class MyTest<T> extends ArrayList<T>{
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int cu;
            @Override
            public boolean hasNext() {

                return cu!=size();
            }

            @Override
            public T next() {
                if (cu>=size()){
                    throw new IllegalArgumentException("index越界");
                }
                T t = get(cu);
                cu++;
                return t;
            }
        };
    }
}