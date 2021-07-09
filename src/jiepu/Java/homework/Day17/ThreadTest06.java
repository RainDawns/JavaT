package jiepu.Java.homework.Day17;

/**
 * @author lnh
 * @date 2021年06月23日 15:27
 */
public class ThreadTest06 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main开始");
        Thread T1=new Thread(){
            @Override
            public void run() {
                System.out.println("T1开始");
                Thread T2=new Thread(){
                    @Override
                    public void run() {
                        System.out.println("T2开始");
                        Thread T3=new Thread(){
                            @Override
                            public void run() {
                                System.out.println("T3开始");
                                System.out.println("T3结束");
                            }
                        };
                        T3.start();
                        try {
                            T3.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("T2结束");
                    }
                };
                T2.start();
                try {
                    T2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1结束");
            }
        };
        T1.start();
        T1.join();
        System.out.println("main结束");
    }
}
