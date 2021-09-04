package systematicLearn.Java.coreJava.ObjectOriented;

import java.util.Objects;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 14:22<br/>
 * @author lnh<br />
 */
public class Employee  {

    private int id;
    private String name;
    private String gender;
    private int age;
    private String iphone;
    private String salary;
    private final String test;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", iphone='" + iphone + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getSalary() {

        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employee() {
        test="";
    }

    public Employee(int id, String name, String gender, int age, String iphone, String salary) {
        test="dgfg";
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.iphone = iphone;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getIphone() {
        return iphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && Objects.equals(name, employee.name) && Objects.equals(gender, employee.gender) && Objects.equals(iphone, employee.iphone);
    }

    public  void  work(String msg){
        System.out.println(this.name+"work is"+msg);
    }
}
