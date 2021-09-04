package systematicLearn.Java.homework.Day13.Collection.studentmanagement;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 17:20<br/>
 *
 * @author lnh<br />
 */
public class Student {

    private String id;
    private String name;
    private Integer age;
    private String sex;

    public Student(String id, String name, Integer age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
