package systematicLearn.Java.netServer;

import java.io.IOException;
import java.net.*;

/**
 * @author lnh
 * @date 2021年06月30日 11:46
 */
public class Udpclient {
    public static void main(String[] args) {
        DatagramSocket dc=null;
        DatagramPacket dp=null;
        try {
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            dc=new DatagramSocket();
            byte[] bytes = "hello word".getBytes();
//            System.out.println("hello word".getBytes().length);
            dp=new DatagramPacket(bytes,bytes.length,ip,7878);
            dc.send(dp);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
