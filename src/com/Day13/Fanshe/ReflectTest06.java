package com.Day13.Fanshe;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 20:43<br/>
 *
 * @author lnh<br />
 */
public class ReflectTest06 {
    public static void main(String[] args)throws  Exception {
        Class string=Class.forName("java.lang.String");
        String sstring = string.getSuperclass().getSimpleName();
        System.out.println(sstring);
        Class[] interfaces = string.getInterfaces();
        for (Class in:interfaces
             ) {
            System.out.println(in.getName());
        }
    }
}
