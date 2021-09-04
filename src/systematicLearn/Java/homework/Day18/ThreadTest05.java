package systematicLearn.Java.homework.Day18;

/**
 * @author lnh
 * @date 2021年06月24日 21:18
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        Flag flag = new Flag(1);
        Thread t = new Thread(new Ayu(flag));
        Thread t1 = new Thread(new Byu(flag));
        t.start();
        t1.start();

    }
}

class Byu implements Runnable {
    private Flag flag;

    public Byu(Flag flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (flag) {
                if (flag.flag == 1) {
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                flag.flag = 1;
                flag.notify();
            }
        }
    }
}

class Ayu implements Runnable {
    private Flag flag;

    public Ayu(Flag flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (flag) {
                if (flag.flag == 0) {
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("A");
                flag.flag = 0;
                flag.notify();
            }
        }

    }
}

class Flag {
    public int flag;

    public Flag(int flag) {
        this.flag = flag;
    }
}
