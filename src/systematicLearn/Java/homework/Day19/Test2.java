package systematicLearn.Java.homework.Day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lnh
 * @date 2021年06月28日 19:03
 */
public class Test2 {
    public static void main(String[] args) {
        FileInputStream fio=null;
        FileOutputStream fos=null;
        try {
            fio=new FileInputStream("C:\\Users\\lnh\\Desktop\\md\\note2.md");
            fos=new FileOutputStream("note2");
            byte[] buf=new byte[1024];
            int len=-1;
            while ((len=fio.read(buf))!=-1){
                fos.write(buf,0,len);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fio!=null){
                try {
                    fio.close();
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
