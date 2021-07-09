package jiepu.Java.homework.Day23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lnh
 * @date 2021年07月02日 16:27
 */
public class Test2 {
    public static void main(String[] args) {
//        System.out.println("ddf".indexOf("张"));
        List<String> memberlist1=new ArrayList<>();
        List<String> memberlist2=new ArrayList<>();
        Collections.addAll(memberlist1,"张三","李四光","武松","诸葛亮","刘兴","章子怡");
        Collections.addAll(memberlist2,"刘广","张易于","黄议","牛顿","张与","大苏打");
        ArrayList<String> namethreelist1 = memberlist1.stream()
                .filter(s -> s.length() == 3)
                .collect(Collectors.toCollection(ArrayList::new));
        List<String> thirdmemberlist1 = memberlist1.stream()
                .limit(3)
                .collect(Collectors.toList());
        List<String> namezhanglist2 = memberlist2.stream()
                .filter(s -> s.indexOf("张") == 0)
                .collect(Collectors.toList());
        List<String> notwolist2 = memberlist2.stream()
                .skip(2)
                .collect(Collectors.toList());
        List<String> allinlist = Stream.concat(memberlist1.stream(), memberlist2.stream()).collect(Collectors.toList());

        List<person> personlist = allinlist.stream()
                .sorted(String::compareTo)
                .map(person::new)
                .collect(Collectors.toList());

        personlist.stream()
                .forEach(System.out::println);


    }
}
class person{
    private String name;

    public person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                '}';
    }
}
