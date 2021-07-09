package com.Day08.exception.homework;
/*
* 用户业务类
*
*
*
* */
public class Uservice {
    public void residter(String name, String password) throws ErrorException {
        if ("".equals(name)| name.length()<6){
            throw new ErrorException("用户名不存在或者长度太短");//name为空或者  长度小于  6   抛出异常
        }
        System.out.println("注册成功");
    }

}
