package com.Day13.Annortation1;
/*
*
* 需求：  写一个包含id注解的类且必须包含int类型的id属性      且id注解只能在类上显示  有一个int型的id属性
*
* */
import java.lang.reflect.Field;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 23:53<br/>
 *
 * @author lnh<br />
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("com.Day13.Annortation1.User");
        //判断是否含有id 注解
        //System.out.println(c.isAnnotationPresent(id.class));
        if( c.isAnnotationPresent(id.class)){
            Field[] fields = c.getDeclaredFields();
            for  ( Field field:fields ) {
                //判断该类是否含有id属性
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())){
                    System.out.println("该类符合要求");
                    break;
                }else {
                    throw new HasNoidException("该类不符合要求原因:不包含id 属性或者不为int属性　");
                }
            }
            // id idannotation = (id) c.getAnnotation(id.class);
            // System.out.println(idannotation.id());
        }else {
            throw new HasNoidException("该类不符合要求原因:不包含id 注解");
        }
    }
}
