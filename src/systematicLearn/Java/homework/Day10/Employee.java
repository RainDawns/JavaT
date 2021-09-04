package systematicLearn.Java.homework.Day10;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/8 16:50<br/>
 *
 * @author lnh<br />
 */
public class Employee {
   /* 假设要为某个公司编写雇员工资支付程序：
    一般工人（Worker）按每月工作的天数计算工资；
    销售人员（Salesman）在基本工资基础上每月还有销售提成；
    经理（Manager） 每月按固定工资支付;
    临时工（Floater ）按小时支付;*/
    /*
    * 设计父类（Employee）描述所有雇员的共同特性（如姓名，性别，出生日期，员工类别），含有
计算工资的父类方法computeSalay,方法中可以是空实现，所有员工用该方法计薪。要求用多态实现。
    * */
    private String name;
    private  char sex;
    private String birthday;
    private String employee_category;

    public Employee(String name, char sex, String birthday, String employee_category) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.employee_category = employee_category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmployee_category() {
        return employee_category;
    }

    public void setEmployee_category(String employee_category) {
        this.employee_category = employee_category;
    }

    public void computeSalay(int date){

    }
}
