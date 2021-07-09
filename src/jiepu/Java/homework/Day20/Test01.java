package jiepu.Java.homework.Day20;

import java.io.*;

/**
 * @author lnh
 * @date 2021年06月29日 16:31
 */
public class Test01 {
    public static void main(String[] args) {
        ObjectInputStream ois=null;
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("student.txt"));
            Student s=new Student("tom",123);
            System.out.println("存放之前的学生:"+s);
            oos.writeObject(s);
            oos.flush();
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
class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private /*transient*/ int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}