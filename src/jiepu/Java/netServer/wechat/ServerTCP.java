package jiepu.Java.netServer.wechat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lnh
 * @date 2021年06月30日 19:20
 */
public class ServerTCP {
    public static void main(String[] args) {
        int port = 8888;
        ServerSocket server = null;
        Socket socket = null;


        boolean flag = true;
        try {
            server = new ServerSocket(port);
            System.out.println("服务器启动，监听端口" + port + "，等待客户端的连接");
            ThreadGroup group = new ThreadGroup("MyGroup");
            while (flag) {
                socket = server.accept();
                System.out.println("服务器接收到客户端的连接:" + socket); //获取输入流，读取客户端发送过来的内容
                Thread t1 = new MyHandle(socket, group);
                t1.start();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally { //关闭资源

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

class MyHandle extends Thread {
    private Socket socket;
    private BufferedReader in = null;
    private PrintWriter out = null;
    private String encoding = "UTF-8";


    public MyHandle(Socket socket, ThreadGroup group) {
        super(group, "dafult" + Math.random());
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream(), encoding));
            //获取输出流，给客户端写回内容
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), encoding));
            this.sendMsg("请输入你的名字: ");
            String name = in.readLine();
            this.sendMsgToAll("欢迎" + name + "加入我们！");

            String line = null;
            while ((line = in.readLine()) != null) {
                this.sendMsgToAll(name + ": " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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

    public void sendMsg(String msg) {
        out.println(msg);
        out.flush();
    }

    public void sendMsgToAll(String msg) {
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        Thread[] list = new Thread[group.activeCount()];
        group.enumerate(list);
        for (Thread t : list) {
            if (t instanceof MyHandle&&!t.getName().equals(Thread.currentThread().getName())) {
                ((MyHandle) t).sendMsg(msg);
            }
        }

    }
}


