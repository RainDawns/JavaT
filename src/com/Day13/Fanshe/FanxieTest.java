package com.Day13.Fanshe;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/27 19:08<br/>
 *
 * @author lnh<br />
 */


public class FanxieTest {
    public static void main(String[] args) {

        Class c = null;
        try {

            //Class方法会导致类加载    类加载执行静态代码块       且静态代码块只会执行一次

            c=Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String a="gdsfd";
        Class y=a.getClass();
        Class you=String.class;
        System.out.println(y==c);
        System.out.println(you==y);


        try {
            Object obj=you.newInstance();
            System.out.println(obj);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
