package systematicLearn.Java.homework.Day9.test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 16:18<br/>
 *
 * @author lnh<br />
 */
public class CheckingAccount extends Account {
    private double overdraft;

    public CheckingAccount(double balance) {
        super(balance);
    }
    public CheckingAccount(double balance,double overdraft) {
        this(balance);
        this.overdraft=overdraft;
    }
    public boolean withdraw(double amount){
        if (getBalance()>=amount){
            super.withdraw(amount);
            return true;
        }else if (overdraft+getBalance()>=amount){
            this.overdraft=overdraft-(amount-getBalance());
            super.withdraw(getBalance());
            return true;
        }
        return false;
    }

    public double getOverdraft() {
        return overdraft;
    }
}
