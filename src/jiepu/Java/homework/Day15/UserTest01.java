package jiepu.Java.homework.Day15;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


/**
 * @author lnh
 * @date 2021年06月20日 13:03
 */
public class UserTest01 {
    public static void main(String[] args) throws Exception {
        Class<User> user = User.class;
        User user1 = user.newInstance();
        Field[] fields = user.getDeclaredFields();
        for (Field f: fields) {
            System.out.println(Modifier.toString(f.getModifiers())+"\t"+ f.getType().getSimpleName()+"\t"+f.getName());
            if ("name".equals(f.getName())){
                f.set(user1,"Hugo");
                System.out.println("获取到得姓名属性值:"+f.get(user1));
//                break;
            }
        }


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Method[] methods = user.getDeclaredMethods();
        for (Method m: methods) {
            System.out.print(Modifier.toString(m.getModifiers())+"\t"+m.getReturnType().getSimpleName()+"\t"+m.getName()+"(");
            Class<?>[] types = m.getParameterTypes();
            for (Class  c:types) {
                System.out.print(c.getSimpleName()+"\t");
            }
            System.out.println("){}");
        }
        System.out.println("调用方法>>>>>>>>>>>");
        Method doSomething = user.getDeclaredMethod("doSomething", int.class, String.class, String.class);
        doSomething.invoke(user1,5,"test","120");

    }
}
