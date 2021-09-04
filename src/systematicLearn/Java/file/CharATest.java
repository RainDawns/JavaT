package systematicLearn.Java.file;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * @author lnh
 * @date 2021年06月28日 16:06
 */
public class CharATest {
    public static void main(String[] args)  {
        char[] array = "hello word".toCharArray();
        char[] arr=new char[array.length];

        CharArrayReader reader=new CharArrayReader(array);
        CharArrayWriter writer=new CharArrayWriter();
        try {
            int len=reader.read(arr);
            writer.write(arr,0,len);
            System.out.println(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null)writer.close();
            if (reader!=null)reader.close();
        }

//        while (true){
//            try {
//                if (!((len=reader.read(arr))!=-1)) break;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            writer.write(arr,0,len);
//            System.out.println(Arrays.toString(arr));
//        }
    }
}
