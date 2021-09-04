package systematicLearn.Java.Annotation;

import java.lang.annotation.*;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/18 10:28<br/>
 *
 * @author lnh<br />
 */
@Documented//生成文档显示使用的注解
@Inherited//表示继承的子类也继承了该注解
@Retention(RetentionPolicy.RUNTIME)//注解生效的阶段、
//注解的能用在的地方    Filed
@Target(ElementType.METHOD)
public @interface AnnotationTest {

}
