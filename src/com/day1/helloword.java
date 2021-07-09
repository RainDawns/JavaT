package com.day1;
import java.io.*;
import java.util.Scanner;

public class helloword {

    public static void main(String[] args) throws IOException {
        /*
         * 简单数组加for循环
         * */
/*        int[] c= {12,1212,133,4,314,34,12412413,413};
        for (int i=0;i<8;i++){
            System.out.println(c[i]);
        }*/


        /*
         * data 函数及其显示
         * */
/*        Date date=new Date();
        System.out.println(date.toString());*/

        /*
         * 简单try catch +线程休眠3秒
         * */
/*        try {
            System.out.println(new Date()+"\n");
            Thread.sleep(1000*3);
            System.out.println(new Date()+"\n");
        } catch (InterruptedException e) {
            System.out.println("fuck");
        }*/

        /*
         * 简单调用
         * */
/*        int x=1;
        a a=new a();
        a.a(x);
        System.out.println("helloword");*/
/*        char c = 0;
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                c = (char) b.read();
                System.out.println(c);
            } catch (IOException e) {
                System.out.println("读取失败");
            }
        }while (c !='q');*/
       /* String d = "";

        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                d=b.readLine();
                System.out.println(d);
            } catch (IOException e) {
                System.out.println("读取失败");
            }
        }while (!d.equals("111"));*/
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        // 构建FileOutputStream对象,文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        Scanner x = new Scanner(System.in);
        /*
        * next() 与 nextLine() 区别
        next():
        1、一定要读取到有效字符后才可以结束输入。
        2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
        3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
        next() 不能得到带有空格的字符串。
        nextLine()：
        1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
        2、可以获得空白。
        *
        * */
        while (x.hasNext()) {
            String c = x.next();
            if ("666".equals(c)) {
                break;
            } else {
                String str = c;
                writer.append(str + "\n");
            }
        }
        x.close();

        // 写入到缓冲区

/*
        writer.append("\r\n");
        // 换行

        writer.append("English");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
*/

        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        fop.close();
        // 关闭输出流,释放系统资源

        FileInputStream fip = new FileInputStream(f);
        // 构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // 构建InputStreamReader对象,编码与写入相同

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();
        // 关闭读取流

        fip.close();
        // 关闭输入流,释放系统资源

    }
}