package jiepu.Java.homework.Day21;

import java.io.*;
import java.net.Socket;

/**
 * @author lnh
 * @date 2021年06月30日 16:12
 */
public class ClientTCP {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 8888;
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        String encoding = "UTF-8";
        try {
            //对象创建成功，就表示连接服务器端成功
            socket = new Socket(host, port);
            //获取输出流，给服务器写内容
            // OutputStream os = socket.getOutputStream();
            // out = new PrintWriter(new OutputStreamWriter(os,"UTF-8"));
            out = new PrintWriter(new
                    OutputStreamWriter(socket.getOutputStream(), encoding));
            //获取输入流，读取服务器端写回的内容
            // InputStream is = socket.getInputStream();
            // in = new BufferedReader(new InputStreamReader(is,"UTF-8"));
            in = new BufferedReader(new
                    InputStreamReader(socket.getInputStream(), encoding));
            out.println("你好，我是client");
            out.flush();
            String line = null;
            line = in.readLine();
            System.out.println("客户端接收到服务器写回的是内容为：" + line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                out.close();
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}