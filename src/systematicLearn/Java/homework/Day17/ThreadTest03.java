package systematicLearn.Java.homework.Day17;

/**
 * @author lnh
 * @date 2021年06月23日 9:45
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup());
        //线程在哪里启动  默认和启动位置线程所在的线程组一致

        ThreadGroup group=new ThreadGroup("刑天");
        group.setMaxPriority(5);
//        group.setDaemon(true);//设置为后台线程
        //很多方法从Api中查看

        Thread[] threads=new Thread[2];

        System.out.println(group.getName());
        Thread t=new Thread(group,"t"){
            @Override
            public void run() {
                System.out.println(getName()+" run  ......");
                System.out.println(getThreadGroup());
            }
        };
        t.start();
        System.out.println(t.getState());
        threads[0]=t;
        System.out.println(group.enumerate(threads));

    }
}
