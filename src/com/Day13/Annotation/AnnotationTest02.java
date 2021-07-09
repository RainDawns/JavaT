package com.Day13.Annotation;

import java.io.PrintStream;
import java.lang.annotation.Annotation;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 21:13<br/>
 *
 * @author lnh<br />
 */
public class AnnotationTest02 {
        //标识性注解
         //@Override只能注解在方法上    给编译器参考的  跟运行阶段无关系      编译器会自动检查加了注解的方法  如果不是重写报错


    public static void main(String[] args) throws Exception{

        /*
        * 反射机制获取反射的属性值   但是   如果反射不保存在 运行时  时    就不能获取到    只能时RUNTIME 时  可以被获取到   】
        *    所有的存放的反射获取值时  都需要获取当前存放的位置   再来判断   然后获取值        具体实例 如下
        *
        * */
        Class c=Class.forName("com.Day13.Annotation.AnnotationTest");
        //System.out.println(c.isAnnotationPresent();  判断类上是否有注解
        //System.out.println(c.isAnnotation());

        System.out.println(c.isAnnotationPresent(MyAnnotation.class));


        if (c.isAnnotationPresent(MyAnnotation.class)){
            //转型   
            MyAnnotation myAnnotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);

            System.out.println(myAnnotation.value());
        }

    }
}
