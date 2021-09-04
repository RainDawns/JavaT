package systematicLearn.Java.homework.Day22;

import java.util.Scanner;
import java.util.function.Consumer;

/**
 * @author lnh
 * @date 2021年07月01日 18:30
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        flip(s1,s -> System.out.println(new StringBuilder(s).reverse()));
    }
    public static <T> void flip(T t,Consumer<T> c){
         c.accept(t);
    }
}
