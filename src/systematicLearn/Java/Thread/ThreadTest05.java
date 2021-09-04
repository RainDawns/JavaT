package systematicLearn.Java.Thread;

/**
 * @author lnh
 * @date 2021年06月24日 14:45
 */
public class ThreadTest05 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new TestThread();
        t.start();
//        System.out.println(t.isInterrupted());
//        t.interrupt();
//        System.out.println(t.isInterrupted());//不该
//        Thread.sleep(400);
//        t.interrupt();
//        System.out.println("main"+t.isInterrupted());
//        Thread.sleep(200);
//        t.interrupt();
    }
}
class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println("1"+this.isInterrupted());
        System.out.println("1"+Thread.interrupted());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
////            e.printStackTrace();
//        }
//        synchronized (this){
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        this.interrupt();
        this.interrupt();
        System.out.println("2"+this.isInterrupted());
        System.out.println("2"+Thread.interrupted());
        System.out.println("2"+this.isInterrupted());
        for (int i = 0; i <1000 ; i++) {

        }
    }
}
