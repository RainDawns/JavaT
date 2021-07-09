package jiepu.Java.homework.Day9.test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 16:06<br/>
 *
 * @author lnh<br />
 */
public class Customer {
    private String name;
    private Account account;

    public Customer(String name) {
        this.name=name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}
