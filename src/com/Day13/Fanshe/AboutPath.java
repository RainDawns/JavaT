package com.Day13.Fanshe;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 9:21<br/>
 *
 * @author lnh<br />
 */
public class AboutPath {
    /**
     * @description:关于路径问题的解决
     * @author:
     * @date: 9:22
     * @param
     * @return:
     */
        //相对路径   ：移植性差
        //绝对路径   ：通用性好    前提文件在类的根路径下     即在src中
    public static void main(String[] args) {
        //Thread.currentThread()  获取当前线程
        //getContextClassLoader()  线程对象的方法 获取当前线程的类加载器对象
        //getResource("")   类加载器的方法    默认从类的根路径加载资源
        //获取到路径为绝对路径
        //在类路径下才能使用
        String Path=Thread.currentThread().getContextClassLoader().getResource("com/Day13/Classinfo.properties").getPath();
        System.out.println(Path);



    }
}
