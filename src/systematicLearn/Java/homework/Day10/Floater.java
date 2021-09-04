package systematicLearn.Java.homework.Day10;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/8 17:05<br/>
 *
 * @author lnh<br />
 */
public class Floater extends Employee{
    private int salay;

    public Floater(String name, char sex, String birthday, String employee_category, int salay) {
        super(name, sex, birthday, employee_category);
        this.salay = salay;
    }

    public int getSalay() {
        return salay;
    }

    @Override
    public void computeSalay(int date) {
        int x= salay*date;
        System.out.println(getEmployee_category()+"工作了"+date+"小时,每小时"+getSalay()+"总工资"+x);
    }
}
