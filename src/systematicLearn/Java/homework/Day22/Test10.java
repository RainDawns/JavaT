package systematicLearn.Java.homework.Day22;

import java.util.function.Function;

/**
 * @author lnh
 * @date 2021年07月01日 18:53
 */
public class Test10 {
    public static void main(String[] args) {
        Function<String,Integer> f= Integer::parseInt;
        Function<String, String> f1 = f.andThen(s -> String.valueOf(s + 10));
        String tf = Tf("123", f1);
        System.out.println(tf);
    }

    public static<T,R> R Tf(T t,Function<T,R> f){
        return  f.apply(t);
    }
}
