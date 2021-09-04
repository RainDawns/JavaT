package systematicLearn.Java.Thread;

/**
 * @author lnh
 * @date 2021年06月22日 11:23
 */
public class ThreadTest02 {

    public static void main(String[] args) {

//        每个线程启动后都有一个自己的栈空间(线程栈）    共享资源共享堆区
        Thread t= new Thread(() -> System.out.println(Thread.currentThread().getName()));
//        t.start();
        t.run();

//        线程并发安全就是共享资源造成的>>>>>>线程安全
//       引用类型   ：数组 类 会被共享
    }

}
