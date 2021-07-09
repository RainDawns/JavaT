package com.Day13.Fanshe;

import java.lang.reflect.Constructor;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 20:37<br/>
 *
 * @author lnh<br />
 */
public class ReflectTest05 {
    public static void main(String[] args) throws  Exception {
        Class VIP=Class.forName("com.Day13.bean.Vip");
        //无参数构造
        Object vip = VIP.newInstance();
        System.out.println(vip);
        //自定义参数列表
        Constructor con = VIP.getDeclaredConstructor(int.class, String.class);
        Object vip1=con.newInstance(213,"enfige");
        System.out.println(vip1);
    }
}
