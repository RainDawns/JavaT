package systematicLearn.Java.homework.Day10;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/8 17:00<br/>
 *
 * @author lnh<br />
 */
public class Salesman extends Employee{
    private int salay;
    private int sales_commission;


    public Salesman(String name, char sex, String birthday, String employee_category, int salay, int sales_commission) {
        super(name, sex, birthday, employee_category);
        this.salay = salay;
        this.sales_commission = sales_commission;
    }

    public int getSalay() {
        return salay;
    }

    public int getSales_commission() {
        return sales_commission;
    }

    @Override
    public void computeSalay(int date) {
       int x=salay*date+this.sales_commission;
        System.out.println(getEmployee_category()+"工作了"+date+"月,"+"每月"+getSalay()+"加上提成"+getSales_commission()+"，总工资"+x);
    }
}
