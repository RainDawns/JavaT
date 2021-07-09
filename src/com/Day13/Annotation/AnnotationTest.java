package com.Day13.Annotation;


/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 21:07<br/>
 *
 * @author lnh<br />
 */
@MyAnnotation(value = "test",value1 = Seaon.SUMMER)
public class AnnotationTest {
    /*
    * 注解又叫注释类型
    * */
    @MyAnnotation(value = "test",value1 = {Seaon.SPERING,Seaon.SUMMER})
    private int no;

    @MyAnnotation(value = "test1",value1 =Seaon.SUMMER)
    private int age;
}
