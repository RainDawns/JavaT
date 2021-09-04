package systematicLearn.Java.Thread;

/**
 * @author lnh
 * @date 2021年06月24日 10:10 3`
 */
public class Account {
    private double balance;
    private String code;

    public Account(double balance, String code) {
        this.balance = balance;
        this.code = code;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public void withdraw(double amount)  {
        if (balance>amount){
            this.balance=balance-amount;
            System.out.println(Thread.currentThread().getName()+"取钱"+amount+"成功");
        }else {
            throw  new IllegalArgumentException(Thread.currentThread().getName()+"取钱"+amount+"钱不够,失败");
        }

    }
}
