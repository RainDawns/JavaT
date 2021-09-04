package systematicLearn.Java.file.Object;

import java.io.*;

/**
 * @author lnh
 * @date 2021年06月29日 10:25
 */
public class ObjectTest {
    public static void main(String[] args) {
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("student.txt"));
            Student s=new Student("tom",12);
            oos.writeObject(s);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
