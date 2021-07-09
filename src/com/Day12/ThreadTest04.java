package com.Day12;
/*
* 守护线程   ：  用户线程结束，守护线程就自动 结束   >>>>>>工具人线程
*
*thread.setDaemon(true);  启动之前添加  即可设置成功
*
*
*
*
* */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
* 定时器：间隔特定时间去操作
*       java.util.Timer
*
* */
public class ThreadTest04 {
    public static void main(String[] args) throws ParseException {
        Timer t=new Timer();
        SimpleDateFormat t1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date s = t1.parse("2021-05-07 23:10:00");
        t.schedule(new tTask(), s,1000*5);
    }

    //定时任务类  编写继承   其中还可以写成匿名内部类

    static class  tTask extends TimerTask{

        @Override
        public void run() {
            SimpleDateFormat t1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String s = t1.format(new Date());
            System.out.println("test"+s);
        }
    }
}
