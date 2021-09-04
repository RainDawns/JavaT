package systematicLearn.Java.homework.Day22;

/**
 * @author lnh
 * @date 2021年07月01日 16:52
 */
public class Testlambda {
    public static void main(String[] args) {
        String s1 = toCaps("cnDhsdf", s -> s.toUpperCase());
        System.out.println(s1);
    }
    public static String toCaps(String s,Change<String> c){
        if (s.length()<4){
            throw new RuntimeException("字符串长度过短");
        }
        System.out.println(s.substring(2, 4));
        return c.getValue(s);
    }
}
interface  Change<T>{
    public T getValue(T str);
}