package com.Day13.Fanshe;

import java.io.InputStream;
import java.util.Properties;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 9:39<br/>
 *
 * @author lnh<br />
 */
public class IoPropertiesTest {
    public static void main(String[] args) throws Exception {
//        while (true){
//
//        }
        /*
        * 需要路径的时候可以返回路径
        * 当需要 返回io流时  返回io流就行了
        * */
        //String Path = Thread.currentThread().getContextClassLoader().getResource("com/Day13/Classinfo.properties").getPath();
        InputStream reader =Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("com/Day13/Classinfo.properties");
        //FileReader reader=new FileReader(Path);
        Properties pro=new Properties();
        pro.load(reader);
        reader.close();
        String ClassName=pro.getProperty("ClassName");
        Class c=Class.forName(ClassName);
        Object o = c.newInstance();
        System.out.println(o);
    }
}
