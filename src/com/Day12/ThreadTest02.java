package com.Day12;

public class ThreadTest02 {
    public static void main(String[] args) {
        Test23 r = new Test23();

        Thread t=new Thread(r);
        t.setPriority(10);//线程的优先级  最大值  10   默认5    最小值为1   值大的处于运行状态更多

        t.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*t.stop();//过时不合理   容易数据丢失*/
        r.run=false;//合理停止线程的方式
    }
    static class  Test23 implements Runnable{
        //打一个布尔标记
        boolean run=true;

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if (run){
                    System.out.println(Thread.currentThread().getName()+">>>>>>>>>");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    //方法结束
                    return;
                }
            }
        }
    }
}
