package jiepu.Java.file;

import java.io.*;

/**
 * @author lnh
 * @date 2021年06月28日 17:08
 */
public class Buffer {
    public static void main(String[] args) {
        BufferedInputStream input=null;
        BufferedOutputStream out=null;
        try {
            long l = System.currentTimeMillis();
            input=new BufferedInputStream(new FileInputStream("data"));
            out=new BufferedOutputStream(new FileOutputStream("you"));
            byte[] buf=new byte[1024];
            int len=-1;
            while ((len=input.read(buf))!=-1){
                out.write(buf,0,len);
            }
            out.flush();
            long last = System.currentTimeMillis();
            System.out.println(last-l);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input!=null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
