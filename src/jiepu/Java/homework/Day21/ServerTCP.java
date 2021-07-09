package jiepu.Java.homework.Day21;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lnh
 * @date 2021年06月30日 16:13
 */
public class ServerTCP {
    public static void main(String[] args) {
        int port = 8888;
        ServerSocket server = null;
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        String encoding = "UTF-8";
        try {
            server = new ServerSocket(port);
            System.out.println("服务器启动，监听端口" + port + "，等待客户端的连接");
            socket = server.accept();
            System.out.println("服务器接收到客户端的连接:" + socket);
//获取输入流，读取客户端发送过来的内容
// InputStream is = socket.getInputStream();
// in = new BufferedReader(new InputStreamReader(is,"UTF-8"));
            in = new BufferedReader(new
                    InputStreamReader(socket.getInputStream(), encoding));
            //获取输出流，给客户端写回内容
// OutputStream os = socket.getOutputStream();
// out = new PrintWriter(new OutputStreamWriter(os,"UTF-8"));
            out = new PrintWriter(new
                    OutputStreamWriter(socket.getOutputStream(), encoding));
            String line = null;
            line = in.readLine();
            System.out.println("服务器端接收到客户端发送的信息：" + line);
            out.println("欢迎访问xxx服务器！");
            out.flush();
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
            if (server != null) {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

