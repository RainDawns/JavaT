package jiepu.Java.homework.Day22;

/**
 * @author lnh
 * @date 2021年07月01日 16:42
 */
public class Test05 {
    public static void main(String[] args) {
        int to = to(Integer::parseInt, "23");
        System.out.println(to);
    }
    public static int to(Transform<String,Integer> t,String s){
       return t.toNum(s);
    }
}
interface  Transform<T,R>{
    R toNum(T t);
}
