package systematicLearn.Java.homework.Day17;

/**
 * @author lnh
 * @date 2021年06月22日 16:39
 */
public class ThreadTest01 {
    public static Integer i = 1;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(ThreadTest01::run);
        t.start();
        synchronized (i) {
            for (; i < 100; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
        Thread.sleep(2000);

    }

    private static void run() {
        synchronized (i) {
            for (; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
