package systematicLearn.Java.homework.Day17;

/**
 * @author lnh
 * @date 2021年06月22日 16:47
 */
public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t= new Thread(() -> {
            for (int i=1;i<=100;i++){
                if (i%2==0) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.setName("t");
        t.start();
        for (int i=1;i<=100;i++){
            if (i%2==1){
                System.out.println(Thread.currentThread().getName()+":"+i);
                Thread.sleep(300);
            }
        }
    }
}
