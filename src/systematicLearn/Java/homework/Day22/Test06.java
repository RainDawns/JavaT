package systematicLearn.Java.homework.Day22;

/**
 * @author lnh
 * @date 2021年07月01日 17:15
 */
public class Test06 {
    public static void main(String[] args) {
        System.out.println(to( 45, 56, (x, y) -> x * y));
        System.out.println(to( 45,  56, (x, y) -> x + y));
    }
    public static Long to(long a,long b,Calue<Long,Long> c){
        return c.ca(a,b);
    }
}

interface  Calue<T,R>{
    R ca(T t,T t2);
}
