package com.Day11;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*java.io.file 类  有可能是文件或者目录   不能完成文件的读写      是文件和目录的抽象表现形式
*
*
* */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File f=new File("G:\\Spring\\CRM_t(7)\\pom.xml");
       /* if (!f.exists()){
            f.createNewFile();//以文件方式创建
            f.mkdir();//以目录方式创建
            f.mkdirs();//以多重目录创建
            f.getAbsolutePath();//获取绝对路径
        }*/
        f.lastModified();//这里返回的是一个毫秒数
        Date date=new Date(f.lastModified());
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(s.format(date));
        System.out.println(f.length());//文件大小



        /*
        * listfiles  返回子目录中的所有的子文件
        *
        *
        * */
    }
}
