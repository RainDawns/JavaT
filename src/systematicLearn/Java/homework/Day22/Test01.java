package systematicLearn.Java.homework.Day22;

import java.util.*;

/**
 * @author lnh
 * @date 2021年07月01日 16:10
 */
public class Test01 {
    public static void main(String[] args) {
        Collection<Integer> list=new ArrayList<>();
        for (int i = 0; i <=20 ; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);
        List<Integer> l=new ArrayList<>();
        list.forEach(s->{
            if (s%2==0){
                l.add(s);
            }
        });
//        list.removeIf(s->s%2==1);
//        System.out.println(list);
        System.out.println(l);
    }
}
