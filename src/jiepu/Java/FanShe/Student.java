package jiepu.Java.FanShe;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 13:08<br/>
 *
 * @author lnh<br />
 */
public class Student {
    //Filed   字段属性
    public int no;
    private String name;
    protected  int age;
    boolean sex;

    public Student(int no, String name, int age, boolean sex) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String
    toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
