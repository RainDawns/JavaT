package com.Day13.UserService;

/**
 * 一些声明信息
 * Description: <br/>   用户业务模块
 * date: 2021/5/30 14:22<br/>
 *
 * @author lnh<br />
 */
public class UserService {
    public boolean login(String username,String password){
        /*
         * Description:用户登录密码
         * @author lnh
         * @date 2021/6/21 14:34
         * @param username 用户名姓名
         * @param password 用户名密码
         * @return boolean 返回是否能登录
         */
        if ("admin".equals(username)&&"123123".equals(password)){
            return true;

        }
        return false;
    }
    public void loginout(){
        /**
         * @description: 用户退出业务模块
         * @author: lnh
         * @date: 14:26
         * @param
         * @return: void  无返回值
         */
        System.out.println("退出登录成功");
    }
}
