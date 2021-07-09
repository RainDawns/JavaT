package com.Day13.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 21:08<br/>
 *
 * @author lnh<br />
 */
//注解属性名为value 时   在加注解时可以省略属性名
    //且必须只有一个·注解
    //其他属性名不可以被省略

    //属性还可以设置默认值   设置之后就可以在使用时不需要添加也不会报错
@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
    Seaon[] value1();
}
