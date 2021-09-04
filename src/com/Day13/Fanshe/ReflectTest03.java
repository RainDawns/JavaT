package com.Day13.Fanshe;

import java.lang.reflect.Field;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 13:43<br/>
 *
 * @author lnh<br />
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        //
        Class stu=Class.forName("systematicLearn.Java.FanShe.Student");
        //实例化对象
        Object o = stu.newInstance();
        //获取属性
         Field nofield = stu.getDeclaredField("no");
        Field namefield = stu.getDeclaredField("name");
        //私有属性   打破封装   缺点>>>>>安全性
        namefield.setAccessible(true);
         nofield.set(o,6656);
         namefield.set(o,"Hugo");
         //可以根据要素点来记忆   但是一般可以不需要    属性就有get，set方法
        System.out.println(nofield.get(o));
        System.out.println(namefield.get(o));

    }
}
