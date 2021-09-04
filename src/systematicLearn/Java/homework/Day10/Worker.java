package systematicLearn.Java.homework.Day10;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/8 16:57<br/>
 *
 * @author lnh<br />
 */
public class Worker extends Employee{
    private int salay;


    public Worker(String name, char sex, String birthday, String employee_category) {
        super(name, sex, birthday, employee_category);
    }

    public Worker(String name, char sex, String birthday, String employee_category, int salay) {
        this(name, sex, birthday, employee_category);
        this.salay = salay;
    }

    public int getSalay() {
        return salay;
    }

    @Override
    public void computeSalay(int date) {
        int x=salay*date;
        System.out.println(getEmployee_category()+"工作了"+date+"天,"+"每天"+getSalay()+"总工资"+x);
    }
}
