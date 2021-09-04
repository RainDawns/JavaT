package systematicLearn.Java.homework.Day22;

/**
 * @author lnh
 * @date 2021年07月01日 16:42
 */
public class Test05 {
    public static void main(String[] args) {
        int to = to(Integer::parseInt, "23");
        System.out.println(to);
    }
    /*
     * @author lnh
     * @date 2021/7/14 20:05
     * @param t 传入接口的实现类
     * @param s 传入一个任意的数据类型
     * @return int 返回返回一个类型的数值
     */
    public static int to(Transform<String,Integer> t,String s){
       return t.toNum(s);
    }
}
interface  Transform<T,R>{
    R toNum(T t);
}
