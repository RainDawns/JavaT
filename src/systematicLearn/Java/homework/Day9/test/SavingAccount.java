package systematicLearn.Java.homework.Day9.test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 16:16<br/>
 *
 * @author lnh<br />
 */
public class SavingAccount extends Account {
    private double rate;

    public SavingAccount(double balance,double rate) {
        super(balance);
        this.rate = rate;
    }
}
