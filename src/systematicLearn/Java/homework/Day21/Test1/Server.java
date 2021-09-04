package systematicLearn.Java.homework.Day21.Test1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author lnh
 * @date 2021年06月30日 15:26
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket sc=null;
        BufferedWriter out=null;
        BufferedInputStream in=null;
        OutputStream outb=null;
        try {
            sc=new ServerSocket(10000);
            Socket cs = sc.accept();
            System.out.println("连接成功");
            in=new BufferedInputStream(cs.getInputStream());

            System.out.println("服务器获取到了读");
            outb=new BufferedOutputStream(new FileOutputStream("./T/x.jpg"));
            System.out.println("服务器开始存");
            int len=-1;
            while ((len=in.read())!=-1){
                outb.write(len);
            }
            outb.flush();
            cs.shutdownInput();
            System.out.println("服务器存完");



            out = new BufferedWriter(new OutputStreamWriter(cs.getOutputStream(), StandardCharsets.UTF_8));
            System.out.println("服务器获取到了写");
            out.write("上传成功");
            System.out.println("服务器写完了");
            out.flush();
            outb.close();
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
