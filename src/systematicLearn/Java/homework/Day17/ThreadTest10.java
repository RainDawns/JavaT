package systematicLearn.Java.homework.Day17;

/**
 * @author lnh
 * @date 2021年06月23日 16:22
 */
public class ThreadTest10 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Runner());
        t.setName("t");
        System.out.println(t.getName()+ t.getState());
        t.start();
        Thread.sleep(1000);
        System.out.println(t.getName()+ t.getState());
        t.interrupt();
        Thread.sleep(1000);
        System.out.println(t.getName()+ t.getState());
    }
}
class Runner implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ Thread.currentThread().getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <10; i++) {

        }
        System.out.println(Thread.currentThread().getName()+ Thread.currentThread().getState());
    }
}
