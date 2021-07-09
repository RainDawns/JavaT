package jiepu.Java.lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author lnh
 * @date 2021年07月01日 11:38
 */
public class InterfaceTest {
    public static void main(String[] args) {



        /*
        *
        * lambda使用的一些限制和匿名匿名内部类相同
        *
        * */
        /*
         * 断言式
         * */
        Predicate<String> a = s -> s.length() > 5;
        System.out.println(a.test("fg"));
        Predicate<String[]> a1 = s -> s.length > 5;
        System.out.println(a1.test(new String[100]));
        //函数式接口编程
        filter(new String[]{}, s -> s.length() > 6);
        //断言式  可以使用两个规则  用来判断范围


        /*
         * 消费式函数接口
         * */
        Consumer<String> con = System.out::println;
        Consumer<String> con1 = s-> System.out.println("henoo"+s);

//        Consumer<Integer> tConsumer = s -> System.out.println("henoo" + s);
//        lamda表达式  可以作为参数存在  并不能以对象形式存在     行为参数化



        Consumer<String> c = con.andThen(con1);
        c.accept("aa");
//        con.accept(567);
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "sdsd", "asdfsf", "asdafaf");
        fors(System.out::println, list);
        list.removeIf(s-> s.length()<5);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
        fors(System.out::println, list);


        /*
        *
        * */

    }

    public static <T> void fors(Consumer<T> c, Collection<T> coll) {
        for (T t:coll) {
            c.accept(t);
        }
    }


    public static String[] filter(String[] arr, Predicate<String> predicate) {
        return new String[]{};
    }
}
