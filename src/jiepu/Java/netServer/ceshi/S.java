package jiepu.Java.netServer.ceshi;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lnh
 * @date 2021年06月30日 14:39
 */
public class S {
    public static void main(String[] args) {
        ServerSocket sc=null;
        try {
            sc=new ServerSocket(8999);
            Socket s=null;
            while ((s=sc.accept())!=null){
                Socket finalS = s;
                if (s.getPort()>14600){
                    new Thread(){
                        @Override
                        public void run() {
                            System.out.println("大于14500");
                            System.out.println(getName()+ finalS);
                        }
                    }.start();
                }else {
                    new Thread(){
                        @Override
                        public void run() {
                            System.out.println("小于等于14500");
                            System.out.println(getName()+ finalS);
                        }
                    }.start();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
