package jiepu.Java.homework.Day13.Collection.studentmanagement;
import java.util.ArrayList;


/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 17:22<br/>
 *
 * @author lnh<br />
 */
public class StudentSystem {
    private ArrayList list;

    public StudentSystem(){
        list=new ArrayList();

    }
    public boolean add(Student student){
        for (Object o:list) {
            Student student1=(Student) o;
            if (student.getId().equals(student1.getId())){
                return false;
            }
        }
        list.add(student);
        return true;


    }
    public boolean delete(String id){
            for (Object o: list) {
                Student s = (Student) o;
                if (s.getId().equals(id)) {
                    list.remove(s);
                    return true;
                }
            }
        return false;
    }

    public Student select(String id){
            for (Object o: list) {
                Student s = (Student) o;
                if (s.getId().equals(id)) {
                    return s;
                }
            }
        return null;
    }

}
