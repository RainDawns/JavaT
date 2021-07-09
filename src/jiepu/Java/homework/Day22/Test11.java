package jiepu.Java.homework.Day22;

import java.util.function.Supplier;

/**
 * @author lnh
 * @date 2021年07月01日 19:17
 */
public class Test11 {
    public static void main(String[] args) {
        Integer[] t= {2,3,4,52,333,23};
        System.out.println(max(t, () -> {
            int max = t[0];
            for (int i = 0; i < t.length; i++) {
                if (max < t[i]) {
                    max = t[i];
                }
            }
            return max;
        }));
    }

    public  static <T> T max(T[] t, Supplier<T> s){
        return s.get();
    }
}
