package jiepu.Java.homework.Day18;

/**
 * @author lnh
 * @date 2021年06月24日 20:14
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        Thread t = new Thread(new ShuZi(data1));
        Thread t1 = new Thread(new ZiMu(data1));
        t.start();
        t1.start();
    }
}

class Data1 {
    public int flag;
}

class ShuZi implements Runnable {
    private Data1 data1;

    public ShuZi(Data1 data1) {
        this.data1 = data1;
    }

    @Override
    public void run() {
        for (int i = 1; i < 27; i++) {
            synchronized (data1) {
                if (data1.flag == 1) {
                    try {
                        data1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(2 * i - 1);
                System.out.print(2 * i);
                data1.flag = 1;
                data1.notify();

            }
        }
    }
}


class ZiMu implements Runnable {
    private Data1 data1;

    public ZiMu(Data1 data1) {
        this.data1 = data1;
    }

    @Override
    public void run() {
        for (int i = 65; i <= 90; i++) {
            synchronized (data1) {
                if (data1.flag == 0) {
                    try {
                        data1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print((char) i);
                data1.flag = 0;
                data1.notify();
            }
        }
    }
}