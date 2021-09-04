package systematicLearn.Java.homework.Day22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author lnh
 * @date 2021年07月01日 18:16
 */
public class Test07 {
    public static void main(String[] args) {
        Predicate<String> p=s -> {
            String[] split = s.split(",");
            if(split[0].length()==3){
                return true;
            }
            return false;
        };
        Predicate<String> p1 = p.and(s -> {
            String[] split = s.split(",");
            if (split[split.length-1].equals("男")) {
                return true;
            }
            return false;
        });
        List<String> filter = filter(new String[]{"卢本伟,男", "五五开,女", "white,男"}, p1);
        System.out.println(filter);

    }
    public static<T> List<T> filter(T[] arr, Predicate<T> p){
        List<T> list=new ArrayList<>();
        for (T s:arr) {
          if (p.test(s)){
              list.add(s);
          }
        }
            return list;
    }

}
