package jiepu.Java.netServer.wechat;

import java.io.*;
import java.net.Socket;

/**
 * @author lnh
 * @date 2021年06月30日 19:21
 */
public class Client1 {
    static BufferedReader in = null;

    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 8888;
        Socket socket = null;
        PrintWriter out = null;

        BufferedReader inFormConsole = null;
        String encoding = "UTF-8";
        try {
            //对象创建成功，就表示连接服务器端成功
            socket = new Socket(host, port);
            System.out.println("客户端连接服务器成功");
            //获取输出流，给服务器写内容

            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), encoding));
            //获取输入流，读取服务器端写回的内容
            in = new BufferedReader(new InputStreamReader(socket.getInputStream(), encoding));
            //创建新的输入流，负责读取从控制台中读取用户输入的内容
            inFormConsole = new BufferedReader(new InputStreamReader(System.in, encoding));
            String msg = in.readLine();
            System.out.print(msg);
            String name = inFormConsole.readLine();
            out.println(name);
            out.flush();

            Thread t = new Thread(() -> {
                String lineFromServer = null;
                try {
                    while ((lineFromServer = in.readLine()) != null) {
                        System.out.println(lineFromServer);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            t.start();
            String lineFromConsole = null;
            String lineFromServer = null;
            while ((lineFromConsole = inFormConsole.readLine()) != null) {
                out.println(lineFromConsole);
                out.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally { //关闭资源
            if (inFormConsole != null) {
                try {
                    inFormConsole.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
