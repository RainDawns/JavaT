package jiepu.Java.coreJava.studentManagement;
import java.util.Scanner;
/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/4 17:06<br/>
 * @author lnh<br />
 */
public class StudentManagementTest {
    public static void main(String[] args) {
        StudentSystem sy=new StudentSystem();
        boolean flag=true;
        while (flag){
            System.out.println("**********************");
            System.out.println("*Student Management");
            System.out.println("**********************");
            System.out.println("*   1) Add                     ");
            System.out.println("*   2) Delete                 ");
            System.out.println("*   3) Update                ");
            System.out.println("*   4) Select                 ");
            System.out.println("*   0) Quit                    ");
            System.out.println("**********************");
            System.out.println("Please choose your operate:");
            Scanner sc=new Scanner(System.in);
            int contro = sc.nextInt();
            switch (contro){
                case 1:{
                    System.out.println("Please input name:");
                    String name = sc.next();
                    System.out.println("Please input age:");
                    int age = sc.nextInt();
                    System.out.println("Please input gender:");
                    String gender= sc.next();
                    Student stu=new Student();
                    stu.name=name;
                    stu.age=age;
                    stu.gender=gender;
                    sy.add(stu);
                    break;
                }
                case 2:{
                    System.out.println("Please input name:");
                    String name = sc.next();
                    boolean delete = sy.delete(name);
                    if (delete){
                        System.out.println("Delete student success");
                    }else {
                        System.out.println("noby");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Please input name:");
                    String name = sc.next();
                    Student stu=new Student();
                    if (sy.selected(name)){
                        System.out.println("Please input  new name:");
                        String name1 = sc.next();
                        System.out.println("Please input new age:");
                        int age = sc.nextInt();
                        System.out.println("Please input new gender:");
                        String gender= sc.next();
                        stu.name=name1;
                        stu.age=age;
                        stu.gender=gender;
                        boolean update = sy.update(name, stu);
                        if (update){
                            System.out.println("update student success");
                        }
                    }else {
                        System.out.println("是否需要添加此人");
                        String st=sc.next();
                        if("是".equals(st)){
                            System.out.println("Please input   name:");
                            String name1 = sc.next();
                            System.out.println("Please input  age:");
                            int age = sc.nextInt();
                            System.out.println("Please input  gender:");
                            String gender= sc.next();
                            stu.name=name1;
                            stu.age=age;
                            stu.gender=gender;
                            sy.add(stu);
                            System.out.println("添加成功");
                        }else {
                            break;
                        }

                    }
                    break;
                }
                case 4:{
                    System.out.println("Please input name:");
                    String name = sc.next();
                    Student student = sy.select(name);
                    if (student==null){
                        System.out.println("查无此人");
                    }else {
                        System.out.println("name:"+student.name+"age:"+student.age+"gender:"+student.gender);
                    }
                    break;
                }
                case 0:{
                        flag=false;
                        break;
                }
            }
        }
    }
}
