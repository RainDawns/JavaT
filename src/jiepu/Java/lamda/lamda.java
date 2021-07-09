package jiepu.Java.lamda;

import java.util.TreeSet;

/**
 * @author lnh
 * @date 2021年07月01日 11:13
 */
public class lamda {
    public static void main(String[] args) {
        Thread t=new Thread(()-> System.out.println("t"));

        TreeSet<Integer> set=new TreeSet<>((o1,o2)->o1-o2);

        TreeSet<String> set1=new TreeSet<>(String::compareTo);

        set1.add("srwe");
        set1.add("wefwefwe");
        set1.add("accsd");
        System.out.println(set1);
    }
}
@FunctionalInterface
interface aUNF {
    void r();
}
