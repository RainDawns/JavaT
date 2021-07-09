package jiepu.Java.homework.Day10.test1;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/8 18:51<br/>
 *
 * @author lnh<br />
 */
public class Company {
    private Employee employee;
    private String name;

    public Company(Employee employee, String name) {
        this.employee = employee;
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
