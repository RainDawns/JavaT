package jiepu.Java.homework.Day11.Danli;


/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/10 19:11<br/>
 *
 * @author lnh<br />
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student=Student.getstudent();
        student.setAge(100);
        System.out.println(student);
        Student s=Student.getstudent();
        System.out.println(s);
    }
}
