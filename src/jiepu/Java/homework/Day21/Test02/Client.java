package jiepu.Java.homework.Day21.Test02;


import java.io.*;
import java.net.Socket;

/**
 * @author lnh
 * @date 2021年06月30日 17:03
 */
public class Client {
    static BufferedReader in = null;

    public static void main(String[] args) {
        Socket s = null;
        PrintWriter out = null;
        BufferedReader infrom = null;
        try {
            s = new Socket("127.0.0.1", 1999);
            System.out.println("连接成功");
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
            infrom = new BufferedReader(new InputStreamReader(System.in));
            String s1 = in.readLine();
            System.out.println(s1);
            String name = infrom.readLine();
            out.println(name);
            out.flush();


            Thread t = new Thread(() -> {
                String inline = null;
                try {
                    while ((inline = in.readLine()) != null) {
                        System.out.println(inline);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            t.start();
            String line = null;
            while ((line = infrom.readLine()) != null) {
                out.println(line);
                out.flush();
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
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (infrom != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
