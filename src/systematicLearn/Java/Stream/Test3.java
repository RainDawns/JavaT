package systematicLearn.Java.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lnh
 * @date 2021年07月02日 14:53
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        Collections.addAll(l, "fsdf", "fsdfs", "fewfw");
        Stream<String> s = l.stream();
        Iterator<String> iterator = s.iterator();
        iterator.forEachRemaining(System.out::println);
        s.max(String::compareTo);
        System.out.println(s
                .filter(s1 -> s1.length() > 4)
                .map(s1-> s1.substring(0,3))
                .limit(1)
                .collect(Collectors.joining("?", "?", "?")));
//                .reduce((o1, o2)->o1+o2)

    }
}
