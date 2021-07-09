package jiepu.Java.homework.Day20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author lnh
 * @date 2021年06月29日 19:28
 */
public class PropertiesFile {
    public static void main(String[] args) {
        System.out.println(look("ip"));
    }

    public static String look(String str){
        BufferedReader reader=null;
        Properties p=new Properties();
        try {
            reader=new BufferedReader(new FileReader("message"));
            p.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (p.getProperty(str)==null){
            throw new RuntimeException("未找到");
        }else {
            return p.getProperty(str);
        }
    }
}
