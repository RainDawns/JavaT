package jiepu.Java.homework.Day13.Collection.studentmanagement;

import java.util.Scanner;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 18:16<br/>
 *
 * @author lnh<br />
 */
public class StudentTest {
    public static void main(String[] args) {
        StudentSystem sy=new StudentSystem();
        boolean flag=true;
        while (flag) {
            System.out.println("学生管理系统");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.查询学生");
            System.out.println("4.退出");
            Scanner sc=new Scanner(System.in);
            int contro = sc.nextInt();
            switch (contro){
                case 1:{
                    System.out.println("请输入id");
                    String id = sc.next();
                    System.out.println("请输入名字");
                    String name = sc.next();
                    System.out.println("请输入年龄");
                    int age = sc.nextInt();
                    System.out.println("请输入性别:");
                    String sex= sc.next();
                    Student s=new Student(id,name,age,sex);
                    if (sy.add(s)){
                        System.out.println("添加成功");
                    }else {
                        System.out.println("学号已存在");
                    }
                    break;
                }
                case 2:{
                    System.out.println("请输入id");
                    String id = sc.next();
                    if (sy.delete(id)){
                        System.out.println("删除成功");
                    }else {
                        System.out.println("删除失败，没有此人");
                    }
                    break;
                }
                case 3:{
                    System.out.println("请输入id");
                    String id = sc.next();
                    Student s=sy.select(id);
                    if (null!=s){
                        System.out.println(s);
                    }else {
                        System.out.println("查无此人");
                    }
                    break;
                }
                case 4:{
                    flag=false;
                    break;
                }
            }
        }
    }
}
