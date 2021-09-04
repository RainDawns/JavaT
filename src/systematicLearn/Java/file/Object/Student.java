package systematicLearn.Java.file.Object;

import java.io.Serializable;

/**
 * @author lnh
 * @date 2021年06月29日 10:26
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;//写进去之后需要改动类  但是重写(需要数据）  这时候就需要一个序列化版本号
    private String name;
    private int age;

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
