package jiepu.Java.file;

import java.io.*;

/**
 * @author lnh
 * @date 2021年06月28日 16:30
 */
public class Test {
    public static void main(String[] args) {
        FileReader reader=null;
        FileWriter writer=null;
        try {
            long before = System.currentTimeMillis();
            reader=new FileReader("G:\\Spring\\SpringMVC_RJ\\SpringMVC_RJ\\src\\com\\briup\\mvc\\User.java");
            writer=new FileWriter("data");
            char[] arr=new char[1024];
//            int len = reader.read(arr);
//            writer.write(arr,0,len);
            int len=-1;
            while ((len=reader.read(arr))!=-1){
                writer.write(arr,0,len);
            }
            writer.flush();
            long last = System.currentTimeMillis();
            System.out.println(last-before);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
