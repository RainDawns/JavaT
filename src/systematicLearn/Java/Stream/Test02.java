package systematicLearn.Java.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lnh
 * @date 2021年07月02日 11:52
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("dsdf", "sdfsd", "dfsfsd", "dsfvsdfsd");
        Stream<String> s = list.stream();
//        System.out.println(stream. anyMatch(s -> s.equals("23")));

//        List<String> collect = stream.limit(2).collect(Collectors.toList());
//        System.out.println(collect);
//        System.out.println(s.max(String::compareTo));

        Stream<String> ded = Stream.of("ded", "dsd");
        //中间操作可以有很多最终操作只有一个  、


//        s.collect(Collectors.toCollection(TreeSet::new));

        System.out.println(s.collect(Collectors.joining(",","---","-----")));


    }
}
