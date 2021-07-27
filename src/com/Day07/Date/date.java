package com.Day07.Date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


/*
*
* 这些都可以从官方文档获取到
*
* */

public class date {
    public static void main(String[] args) throws ParseException {
        //获取系统的当前时间
        Date nowtime=new Date();
/*        System.out.println(nowtime);*/

        /*
        * yyyy/MM/dd HH:mm:ss    年月日   时分秒
        * */
        SimpleDateFormat s=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String s1=s.format(nowtime);
        System.out.println(s1);


        /*
        *字符串转换成   日期
        *   yyds:永远单身    永远的神
        * */
        Date date = s.parse("2018/09/08 12:34:78");
        System.out.println(date);
        /*、
        *
        * 总毫秒数
        * */
        long timeMillis=System.currentTimeMillis();
        System.out.println(timeMillis);


        /*
        *
        * 统计一个方法运行的耗费的时长
        * */
       long begin= System.currentTimeMillis();
        print();
        long end =System.currentTimeMillis();
        System.out.println(end-begin);

        /*
        * 传入的参数是毫秒  得出的时间是自从1970/01/01 00:00:00 000   过去了多少毫秒
        * 这里表示前一天的时间   >>>>>>
        * */
        Date time1=new Date(System.currentTimeMillis()-1000*60*60*24);
        String s11=s.format(time1);
        System.out.println(s11);

        Random random=new Random();

        /*
        * bound: 表示范围  [0,10]
        * */
        int q=random.nextInt(11);
        System.out.println(q);

    }

    private static void print() {
        for (int i = 0; i < 1000890000; i++) {
            /*System.out.println(i);*/
        }
    }

}
