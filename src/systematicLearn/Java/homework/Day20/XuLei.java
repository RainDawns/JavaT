package systematicLearn.Java.homework.Day20;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author lnh
 * @date 2021年06月29日 20:34
 */
public class XuLei {
    public static void main(String[] args) {
        threadcopy("x.jpg", "copy2.jpg");
    }

    public static void threadcopy(String path1, String path2) {
        RandomAccessFile in = null;
        RandomAccessFile out = null;
        try {
            in = new RandomAccessFile(path1, "rw");
            out = new RandomAccessFile(path2, "rw");
            First f=new First(in,out);
            Last l=new Last(in,out);
            f.start();
            l.start();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class First extends Thread{
    private RandomAccessFile in;
    private RandomAccessFile out;

    public First(RandomAccessFile in, RandomAccessFile out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public void run() {
            try {
                long length = in.length();
                synchronized (out){
                    in.seek(length/2);
                    out.seek(length/2);
                    int len=-1;
                    while ((len=in.read())!=-1){
                        out.write(len);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}
class Last extends Thread{
    private RandomAccessFile in;
    private RandomAccessFile out;

    public Last(RandomAccessFile in, RandomAccessFile out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public void run() {
        int len=-1;
        synchronized (out){
            try {
                long length = in.length();
                in.seek(0);
                out.seek(0);
                while ((len=in.read())!=-1){
                    out.write(len);
                    if (out.getFilePointer()>length/2)break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
