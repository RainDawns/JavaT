package jiepu.Java.homework.Day17;

/**
 * @author lnh
 * @date 2021年06月23日 16:34
 */
public class ThreadTest11 {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group=new ThreadGroup("参赛人");
        Thread rabbit=new Thread(group,new Rabbit(),"rabbit");
        Thread tortoise=new Thread(group,new Tortoise(),"tortoise");
        rabbit.start();
        tortoise.start();
//        Set set=new HashSet();
//        set.add(new Object());
//        System.out.println(set.remove("2"));
        while (true) {
            if (group.activeCount() == 1) {
                if (rabbit.getState().equals(Thread.State.TERMINATED)) {
                    System.out.println("兔子赢了");
                    break;
                } else {
                    System.out.println("乌龟赢了");
                    break;
                }
            }

        }

    }
}
class Rabbit implements Runnable{
    @Override
    public void run() {
        int x=0;
        while (true){
            double x1=Math.random();
            if (x1<=0.3){
               x=x+2;
            }
            if (x==100){
//                System.out.println("兔子赢了");
                return;
            }
        }
    }
}
class  Tortoise implements Runnable{
    @Override
    public void run() {
        int x=0;
        while (true){
            double x1=Math.random();
            if (x1>0.3){
                x++;
            }
            if (x==100){
//                System.out.println("乌龟赢了");
                return;
            }
        }
    }
}
