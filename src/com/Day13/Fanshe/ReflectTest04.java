package com.Day13.Fanshe;

import java.lang.reflect.Method;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 14:08<br/>
 *
 * @author lnh<br />
 */
public class ReflectTest04 {
    public static void main(String[] args) throws Exception{
        Class userservice=Class.forName("com.Day13.UserService.UserService");
        Object users=userservice.newInstance();
        /*
        * 必须掌握    五颗星      这里invoke       必须记住      反射机制让代码更加灵活  框架就是使用这种形式  让其更加灵活好开发
        * */
        Method loginmethod = userservice.getDeclaredMethod("login", String.class, String.class);
         Object result = loginmethod.invoke(users, "admin", "123123");
         boolean re= (boolean) result;
        System.out.println( re ? "登录成功" : "登录失败");
    }
}
