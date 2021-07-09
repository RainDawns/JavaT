package jiepu.Java.homework.Day21.Test02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lnh
 * @date 2021年06月30日 17:03
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket sc = null;
        try {
            sc = new ServerSocket(1999);
            ThreadGroup group = new ThreadGroup("group");
            while (true) {
                Socket a = sc.accept();
                System.out.println(a);
                Thread t1 = new ClientThread(a, group);
                t1.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                try {
                    sc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ClientThread extends Thread {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;


    public ClientThread(Socket s, ThreadGroup group) {
        super(group, " " + Math.random() * 10);
        this.socket = s;
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            String m = "请输入你的姓名";
            sendMsg(m);
            String name = in.readLine();
            String ms = "欢迎" + name;
            sendToAll(ms);


            String line = null;
            while ((line = in.readLine()) != null) {
                sendToAll(name + ":" + line);
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

    public void sendToAll(String s) {
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        Thread[] threads = new Thread[group.activeCount()];
        group.enumerate(threads);
        for (Thread t : threads) {
            if (t instanceof ClientThread && !t.getName().equals(Thread.currentThread().getName())) {
                ((ClientThread) t).sendMsg(s);
            }
        }
    }
}
