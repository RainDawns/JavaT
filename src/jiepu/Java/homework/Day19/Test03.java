package jiepu.Java.homework.Day19;

import java.io.*;

/**
 * @author lnh
 * @date 2021年06月28日 19:14
 */
public class Test03 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        PrintStream ops=null;
        try {
            fis=new FileInputStream("C:\\Users\\lnh\\Desktop\\md\\note2.md");
            ops=System.out;
            byte[] buf=new byte[1024];
            int len=-1;
            while ((len=fis.read(buf))!=-1){
                ops.write(buf,0,len);
            }
            ops.flush();
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
            if (ops!=null){
                ops.close();
            }
        }
    }
}
