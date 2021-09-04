package systematicLearn.Java.homework.Day21.Test1;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author lnh
 * @date 2021年06月30日 15:26
 */
public class Client {
    public static void main(String[] args) {
        Socket s=null;
        BufferedReader in=null;
        BufferedOutputStream out=null;
        InputStream inb=null;
        try {
            s=new Socket("127.0.0.1",10000);
            System.out.println("连接成功");
            out=new BufferedOutputStream(s.getOutputStream());
            System.out.println("客户获取到写");
            int len=-1;
            inb=new BufferedInputStream(new FileInputStream("x.jpg"));
            System.out.println("客户开始写");
            while ((len=inb.read())!=-1){
                out.write(len);
            }
            out.flush();
            s.shutdownOutput();
            System.out.println("客户写完了");




            in=new BufferedReader(new InputStreamReader(s.getInputStream(), StandardCharsets.UTF_8));
            System.out.println("客户开始读");
            String s1 = in.readLine();
            System.out.println(s1);
            System.out.println("客户读完了");

            out.close();
            inb.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
