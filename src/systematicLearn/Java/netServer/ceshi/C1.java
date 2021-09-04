package systematicLearn.Java.netServer.ceshi;

import java.io.IOException;
import java.net.Socket;

/**
 * @author lnh
 * @date 2021年06月30日 14:39
 */
public class C1 {
    public static void main(String[] args) {
        Socket s=null;
        try {
//            InetAddress address = InetAddress.getByName("168.78.78.1");

            s=new Socket("127.0.0.1",8999);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
