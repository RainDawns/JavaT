package systematicLearn.Java.homework.Day9.test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 16:07<br/>
 *
 * @author lnh<br />
 */
public class Account {
    private  double balance;


    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        this.balance=balance+amount;
        return true;
    }
    public boolean withdraw(double amount) {
        if (balance>=amount){
            this.balance=balance-amount;
            return true;

        }
        return false;

    }

}
