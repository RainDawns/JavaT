package systematicLearn.Java.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lnh
 * @date 2021年06月24日 10:16
 */


/*、
*
*
*
*
* */
public class Test {
    public static void main(String[] args) {
        Account account = new Account(1002, "123");
        Thread t = new Thread(new AccountThread(account, 1000), "小明");
        Thread t1 = new Thread(new AccountThread(account, 1000), "小红");
        Lock lock = new ReentrantLock();//创建lock锁
        lock.lock(); //在有出现线程安全的代码之前添加
        t1.start();
        t.start();
        lock.unlock();//显示调用
    }
}
