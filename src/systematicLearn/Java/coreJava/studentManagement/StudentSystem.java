package systematicLearn.Java.coreJava.studentManagement;

import java.util.Arrays;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/4 16:45<br/>
 *
 * @author lnh<br />
 */
public class StudentSystem {
    Student[]  stu=new Student[10];


    public void add(Student student){
        for (int i = 0; i < stu.length; i++) {
            if (stu[i]==null){
                stu[i]=student;
                System.out.println("Add student success!");
                break;
            }else if (i==stu.length-1){
                int maxLength=2*stu.length;
                stu= Arrays.copyOf(stu,maxLength);
                //System.out.println(stu.length);
                stu[i+1]=student;
                System.out.println("Add student success!");
                break;
            }
        }
    }

/*    public Student[] Expansion(Student[] students){
        int maxLength=2*students.length;
        Student[]  stu=new Student[maxLength];
        for (int j = 0; j < students.length; j++) {
            stu[j]=students[j];
        }
        return stu;
    }*/

    public boolean delete(String name){
        for (int i = 0; i < stu.length; i++) {
            if (stu[i]==null){
                break;
            } else if (name.equals(stu[i].name)){
                stu[i]=null;
                return true;
            }
        }
        return false;
    }

    public boolean update(String name,Student student){
        for (int i = 0; i < stu.length; i++) {
            if (stu[i]==null){
                break;
            } else if (name.equals(stu[i].name)){
                stu[i]=null;
                stu[i]=student;
                return true;
            }
        }
        return false;
    }
    public boolean selected(String name){
        for (int i = 0; i < stu.length; i++) {
            if (stu[i]==null){
                break;
            }else if(name.equals(stu[i].name)){
                return true;
            }
        }
        return false;
    }
    public Student select(String name){
        /**
         * @description:
         * @author:  lnh
         * @date: 9:40
           * @param name
         * @return: jiepu.Java.coreJava.studentManagement.Student
         */
        for (int i = 0; i < stu.length; i++) {
            if (stu[i]==null){
                return null;
            }else if(name.equals(stu[i].name)){
                return stu[i];
            }
        }
        return null;
    }

}
