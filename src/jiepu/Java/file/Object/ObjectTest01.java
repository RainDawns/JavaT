package jiepu.Java.file.Object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author lnh
 * @date 2021年06月29日 10:41
 */
public class ObjectTest01 {
    public static void main(String[] args) {
        ObjectInputStream ois=null;
        try {
            ois=new ObjectInputStream(new FileInputStream("student.txt"));
            Object o = ois.readObject();
            System.out.println(o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
