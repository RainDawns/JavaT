package systematicLearn.Java.netServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author lnh
 * @date 2021年06月30日 11:46
 */
public class Udpserver {
    public static void main(String[] args) {
        DatagramSocket ds=null;
        DatagramPacket dp=null;
        try {
            ds=new DatagramSocket(7878);
//            接受数据包
            byte[] bytes = new byte[10];
            dp=new DatagramPacket(bytes,bytes.length);

            ds.receive(dp);
            byte[] data = dp.getData();
//            String s = data.toString();
//            System.out.println(Arrays.toString(data));
            System.out.write(data,0,data.length);

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
