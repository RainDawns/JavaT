package com.Day13.bean;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/27 19:46<br/>
 *
 * @author lnh<br />
 */
public class User {
    private  String  name;

    public User() {
        name="lnh";
        System.out.println("无参构造方法 ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
