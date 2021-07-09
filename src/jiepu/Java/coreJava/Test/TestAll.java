package jiepu.Java.coreJava.Test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/2 11:54<br/>
 *
 * @author lnh<br />
 */
public class TestAll {
    public static void main(String[] args) {
        String str=new String("23423423423423");
        String str1=new String("23423423423423");
        String str2="32423423";
        String str3="32423423";
        System.out.println(str2.equals(str3));
        System.out.println(str2==str3);

        //重写tostring 的结果

        System.out.println(str.equals(str1));
        System.out.println(str1==str);
    }
}
