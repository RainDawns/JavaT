package jiepu.Java.lamda;

import java.util.Optional;

/**
 * @author lnh
 * @date 2021年07月02日 10:23
 */
public class OptionalTest {
    public static void main(String[] args) {
//        Optional op=Optional.ofNullable(null);
//        String s=new Scanner(System.in).nextLine();
        String s=null;
        if (Optional.ofNullable(s).isPresent()){
            System.out.println("true");
        }
        Optional<String> string = Optional.of("string");
        string.filter(s1 -> s1.length()>5);
        System.out.println(string.get());


        Optional<Object> empty = Optional.of("vsdvsd");
        Object f = empty.orElse("阿斯顿法定法定");
        System.out.println(f);

//        Optional<Object> empty = Optional.empty();
//        System.out.println(empty.get());

        String ss=null;
//        Optional<String> ss1 = Optional.of(ss);
        //不为空才执行
        Optional.ofNullable("null").ifPresent(System.out::println);




    }
}
