package jiepu.Java.homework.Day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lnh
 * @date 2021年06月28日 19:22
 */
public class Test04 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("C:\\Users\\lnh\\Pictures\\Saved Pictures\\q.jpg");
            fos=new FileOutputStream("x.jpg");
            byte[] buf=new byte[1024];
            int len=-1;
            while ((len=fis.read(buf))!=-1){
                fos.write(buf,0,len);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
