package jiepu.Java.homework.Day10.test1;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/8 18:52<br/>
 *
 * @author lnh<br />
 */
public class Employee {
    private Car car;
    private String name;

    public Employee(Car car, String name) {
        this.car = car;
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println(getName()+"开"+getCar().getName()+"去公司");
    }
}
