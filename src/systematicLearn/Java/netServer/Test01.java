package systematicLearn.Java.netServer;

import java.io.*;
import java.net.Socket;

/**
 * @author lnh
 * @date 2021年06月30日 10:26
 */

public class Test01 {
    /*
    * 客户端  tcp
    * */
    public static void main(String[] args) {
        Socket s=null;
        ObjectOutputStream obj=null;
        BufferedReader br=null;
        try {
            s=new Socket("127.0.0.1",7878);
            //获取输入出流
            OutputStream outputStream = s.getOutputStream();
            obj=new ObjectOutputStream(outputStream);
//            T t=new T("1233");
//            obj.writeObject(t);
            obj.flush();


            InputStream inputStream = s.getInputStream();
            br=new BufferedReader(new InputStreamReader(inputStream));
            System.out.println(br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (obj!=null){
                try {
                    obj.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (s!=null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
//class T implements Serializable{
//    private String nasme;
//
//    public T(String nasme) {
//        this.nasme = nasme;
//    }
//
//    @Override
//    public String toString() {
//        return "T{" +
//                "nasme='" + nasme + '\'' +
//                '}';
//    }
//}


