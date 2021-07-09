package jiepu.Java.file;

import java.io.*;
import java.util.Arrays;

/**
 * @author lnh
 * @date 2021年06月25日 14:08
 */
public class ByteATest {
    public static void main(String[] args) throws IOException {

        //设置循环退出条件来实现输出多个B
        ByteArrayOutputStream bios=new ByteArrayOutputStream();
        byte[] bytes="hello word!".getBytes();
        InputStream bis=new ByteArrayInputStream(bytes);
        try {
//            bios.write(bytes,0,bytes.length);

            int len=0;
            while ((len=bis.read())!=-1){
                bios.write(new byte[len],0,len);
                byte[] bytes1 = bios.toByteArray();
                System.out.println(Arrays.toString(bytes1));
            }

        } finally {
            bios.close();
        }
    }

//
//    public static void main(String[] args) {
////1.声明流
//        InputStream in = null;
//        OutputStream out = null;
////2.创建流
//        byte[] arr = "hello".getBytes();
//        in = new ByteArrayInputStream(arr);
//        out = new ByteArrayOutputStream();
////3.使用流
//        int len = -1;
//        byte[] buf = new byte[1024];
//        System.out.println(buf.length);
//        try {
//            len = in.read(buf);
//            System.out.println(len);
////将数据写入到了out对象中的属性里面，该属性是一个字节数组
//            out.write(buf, 0, len);
//            out.flush();
////ByteArrayOutputStream中的toByteArray方法，可以将写入到out对象中的数据返回
//            byte[] toByteArray = ((ByteArrayOutputStream) out).toByteArray();
//            System.out.println(Arrays.toString(toByteArray));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
////4.关闭流
//            if (in != null) {
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (out != null) {
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
}

