package jiepu.Java.homework.Day10.test1;


/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/8 19:00<br/>
 *
 * @author lnh<br />
 */
public class Test {
    public static void main(String[] args) {
        Car car=new Car("车");
        Employee employee=new Employee(car,"小张");
        Company company=new Company(employee,"有限公司");
        employee.work();
    }

}
