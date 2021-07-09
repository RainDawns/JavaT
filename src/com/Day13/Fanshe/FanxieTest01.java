package com.Day13.Fanshe;

import java.io.FileInputStream;

import java.util.Properties;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/27 19:50<br/>
 *
 * @author lnh<br />
 */
public class FanxieTest01 {
    public static void main(String[] args) throws Exception {
        /**
         * @description:    符合OPC规则    学习反射机制有利于框架的底层原理代码
         * @author:
         * @date: 20:01
           * @param args
         * @return: void
         */
        //通过文件流获取  文件输入流
        FileInputStream f=new FileInputStream("E:\\IntelliJ IDEA 2020.3.2\\Project\\JavaT\\src\\com\\Day13\\Classinfo.properties");
        //System.out.println(f);
        //创建map下的properties
        Properties pro =new Properties();
        //将数据加入到properties中
        pro.load(f);
        //获取类名
        f.close();
        String className = pro.getProperty("ClassName");
        //通过反射机制实例化对象
        Class c=Class.forName(className);
        Object obj = c.newInstance();

        System.out.println(obj);

    }
}
