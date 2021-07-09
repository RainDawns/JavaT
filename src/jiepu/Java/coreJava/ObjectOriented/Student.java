package jiepu.Java.coreJava.ObjectOriented;

import java.util.Objects;

/**
 * 一些声明信息
 * Description: 1<br/>
 * date: 2021/6/4 10:12
 * @author lnh
 *
 */
/*
* 可变长度参数  >>>>>.   数组
* 在方法重载时，对于这两种参数一视同仁   注意参数列表的不同才能实现不同的方法
 */
//类也是封装
public class Student {
    //属性的封装
    private String name;
    private char sex;

    public Student(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }
    /*
    *无参构造器不存在  jvm会默认给一个  但是如果写了其他的构造器，那么默认的就会失效
    *
    * 但是如果写了一个无参构造器     那么 就是自己定义了  那么 就不算默认的无参构造器
    *
    * 构造器重载
    * */
    //constructor
    public Student() {
        /*
        * 构造器调用  必须在第一行
        * 只能在构造器里调用
        * */
        this("tom",'男');
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && Objects.equals(name, student.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }
}
