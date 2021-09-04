package systematicLearn.Java.file;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lnh
 * @date 2021年06月25日 11:01
 */
public class FileInput {
    public static void main(String[] args) throws IOException {
        //从控制台获取数据  reader  输入流
        InputStream inputStream = System.in;
//        System.out.println("1");
//        PrintStream out = System.out;
        OutputStream out1 = System.out;

        try {
//            int read = inputStream.read();//读取一个字节存放字节本身
//            System.out.println("1");
//            System.out.println(read);
//            int i=0;
//            while ((i=inputStream.read())!=9){
////                out.println(i);
////                out.flush();
//                out1.write(i);
//                out1.flush();
//            }


            byte[] buf=new byte[20];//存放字节本身
//            int read = inputStream.read(buf);//返回的字节数
//            System.out.println(read);
//            System.out.println(Arrays.toString(buf));
//            String s="hello";
//            byte[] bytes = s.getBytes();
//            out1.write(bytes);
            int len=-1;
            while ((len=inputStream.read(buf,0,buf.length))!=-1){
                out1.write(buf,0,len);

            }



//            int read = inputStream.read(buf, 0, 4);//off从何处开始   len长度   返回值和上面一致
//            System.out.println(read);
//            System.out.println(Arrays.toString(buf));
        }finally {
            inputStream.close();
//            out.close();
            out1.flush();
            out1.close();
        }

    }
}
