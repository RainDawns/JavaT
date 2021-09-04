package systematicLearn.Java.file;

import java.io.*;

/**
 * @author lnh
 * @date 2021年06月28日 14:49
 */
public class FileTest {
    public static void main(String[] args) {
//        String path=
//        File file=new File("G:\\Python");
//        if (file.exists()){
//            System.out.println("true");
//        }
        FileInputStream input=null;
        FileOutputStream out=null;
        try {
            input= new FileInputStream(new File("G:\\Spring\\SpringMVC_RJ\\SpringMVC_RJ\\src\\com\\briup\\mvc\\User.java"));
            byte[] buf=new byte[1024];
            out=new FileOutputStream("test1",false);
            int len=-1;
            while ((len=input.read(buf))!=-1){
                out.write(buf,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (input!=null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out!=null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }



    }
}
