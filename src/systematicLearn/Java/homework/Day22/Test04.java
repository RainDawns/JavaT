package systematicLearn.Java.homework.Day22;

/**
 * @author lnh
 * @date 2021年07月01日 16:37
 */
public class Test04 {
    public static void main(String[] args) {
        Thread t= new Thread(()-> System.out.println(Thread.currentThread().getName()+"运行run方法"),"t线程");
        t.start();
    }
}
