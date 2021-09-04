package systematicLearn.Java.Thread;

/**
 * @author lnh
 * @date 2021年06月24日 10:12
 */
public class AccountThread implements Runnable {
    private final Account account;
    private final double amount;

    public AccountThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        synchronized (account) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withdraw(amount);
        }
    }
}
