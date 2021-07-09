package jiepu.Java.coreJava.Test;

/**
 * @author lnh
 * @date 2021年07月04日 10:37
 */
public class StringTest {
    public static void main(String[] args) {
//        System.out.println("edf".substring(1));
//        System.out.println("最终结果"+reverseStringByRecursion("youtobe"));
    }

    public static String reverseStringByRecursion(String str) {

        System.out.println(str);
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseStringByRecursion(str.substring(1)) + str.charAt(0);
    }
}
