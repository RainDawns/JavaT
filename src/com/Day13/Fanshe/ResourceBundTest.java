package com.Day13.Fanshe;

import java.util.ResourceBundle;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 10:07<br/>
 *
 * @author lnh<br />
 */

/*
* java.util下一个资源绑定器
*文件必须放在类的根目录下路径下
*只能绑定  properties文件
*
*
* 不需要创建  properties  数据结构
* */
public class ResourceBundTest {
    public static void main(String[] args) {
        ResourceBundle bundle=ResourceBundle.getBundle("com/Day13/Classinfo");
        String s = bundle.getString("ClassName");
        System.out.println(s);

    }
}
