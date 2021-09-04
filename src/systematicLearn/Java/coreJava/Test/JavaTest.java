package systematicLearn.Java.coreJava.Test;

import java.lang.reflect.Field;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/8 11:12<br/>
 *
 * @author lnh<br />
 */
public class JavaTest {
    public static void main(String[] args) {
        Class<String> s = String.class;
        Field[] declaredFields = s.getDeclaredFields();
//        s.getDeclaredConstructor()
//                getDeclaredFields
//                getDeclaredMethods
//                getDeclaredConstructors

    }
}
