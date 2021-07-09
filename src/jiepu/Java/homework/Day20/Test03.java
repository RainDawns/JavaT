package jiepu.Java.homework.Day20;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author lnh
 * @date 2021年06月29日 16:51
 */
public class Test03 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        int count1=0;
        int count2=0;
        try {
            fis=new FileInputStream("calcCharNum.txt");
            int len=-1;
            while ((len=fis.read())!=-1){
                if ('a'==(char)len){
                    count1++;
                }else if ('A'==(char)len){
                    count2++;
                }
            }
            System.out.println("a出现的次数"+count1);
            System.out.println("A出现的次数"+count2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
