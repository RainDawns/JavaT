package jiepu.Java.netServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lnh
 * @date 2021年06月30日 10:59
 */
public class Test2 {
    /*
     * 服务端  tcp
     * */
    public static void main(String[] args) {
        ServerSocket sc=null;
        ObjectInputStream in=null;
        BufferedWriter bf=null;
        try {
//            创建对象进行模仿服务器
            sc=new ServerSocket(7878);
            System.out.println("等待客户端");
//            获取客户端发送的socket   会进行阻塞
            Socket accept = sc.accept();

            System.out.println("客户端"+accept);
            InputStream inputStream = accept.getInputStream();
            in=new ObjectInputStream(inputStream);
            Object o = in.readObject();
            System.out.println(o);



            OutputStream outputStream = accept.getOutputStream();
            bf=new BufferedWriter(new OutputStreamWriter(outputStream));
            bf.write("收到");
            bf.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bf!=null){
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (sc!=null){
                try {
                    sc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
