package com.Day13.Fanshe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 13:06<br/>
 *
 * @author lnh<br />
 */
public class ReflectTest02 {
    public static void main(String[] args) throws Exception {

     /*   StringBuilder a=new StringBuilder();
     * 这是一个字符拼接常使用的  、
     * a.append   来添加
     *拼接过多的字符串会消耗过多的方法区当中的常量池的容量  或者说jvm消耗的内存
     *
     * */

        Class  stu=Class.forName("jiepu.Java.FanShe.Student");
        Field[] fields = stu.getFields();
        System.out.println(fields[0]);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //获取所有的属性 ，不只是简单的public修饰的
        Field[] fields1 = stu.getDeclaredFields();

        for (Field field:fields1) {
            int modifiers = field.getModifiers();//修饰符>>>.数字
            String mod= Modifier.toString(modifiers);    //方法转化成字符
            System.out.println(mod);
            //输出属性的类型
            Class type = field.getType();
            String name = type.getSimpleName();
            System.out.println(name);
            //输出属性名
            System.out.println(field.getName());
        }
    }
}
