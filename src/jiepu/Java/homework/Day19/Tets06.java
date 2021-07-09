package jiepu.Java.homework.Day19;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lnh
 * @date 2021年06月28日 20:15
 */
public class Tets06 {
    public static void main(String[] args) {
        FileWriter writer=null;
        try {
            writer=new FileWriter("hello.txt");
            char[] array = "HelloJavaWorld你好世界".toCharArray();
            writer.write(array,0,array.length);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
