package jiepu.Java.homework.Day17;

/**
 * @author lnh
 * @date 2021年06月23日 15:57
 */
public class ThreadTest08 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
//                    e.printStackTrace();
                }
//                try {
//                    sleep(2000);
//                } catch (InterruptedException e) {
////                    e.printStackTrace();
//                }
                for (int i = 0; i <10 ; i++) {

                }

            }
        };
        t.start();
        t.interrupt();
        System.out.println("打断之后"+t.isInterrupted());
        Thread.sleep(1000);
        System.out.println("运行后"+t.isInterrupted());
    }
}
