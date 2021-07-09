package jiepu.Java.homework.Day11.Danli;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/10 18:59<br/>
 *
 * @author lnh<br />
 */
public class Student {
    /*
    * 单例模式:从类中获取对象  获取到的是同一个
    *
    *
    * */
    private String name;
    private int age;
    private static Student stu=new Student("",0);
    private Student(String name, int age) {
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
    public static Student getstudent(){
        return stu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
