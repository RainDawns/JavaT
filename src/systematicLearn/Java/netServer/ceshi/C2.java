package systematicLearn.Java.netServer.ceshi;

import java.io.IOException;
import java.net.Socket;

/**
 * @author lnh
 * @date 2021年06月30日 14:39
 */
public class C2 {
    public static void main(String[] args) {
        Socket s=null;
        try {
//            InetAddress address = InetAddress.getByName("192.168.23.324");
            s=new Socket("127.0.0.1",8999);
//            InputStream in=System.in;
//            InputStreamReader isr=new InputStreamReader(in);
//            BufferedReader bf=new BufferedReader(isr);
//            String str=null;
//            while (!(str=bf.readLine()).equals("exit")){
//                System.out.println(str);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
