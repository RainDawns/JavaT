package jiepu.Java.homework.Day19;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @author lnh
 * @date 2021年06月28日 22:51
 */
public class Test08 {
    public static void main(String[] args) {
        PipedReader reader=new PipedReader();
        PipedWriter writer=null;
        try {
            writer= new PipedWriter(reader);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread rea=new Reader(reader);
        Thread wri=new Writer(writer);
        rea.start();
        wri.start();
        try {
            rea.join();
            wri.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
class Reader extends Thread{
    private PipedReader reader;
    public Reader(PipedReader reader){
        this.reader=reader;
    }

    @Override
    public void run() {
        try {
            int len=-1;
            while ((len=reader.read())!=-1){
                System.out.write(len);
                System.out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Writer extends Thread{
    private PipedWriter writer;
    public Writer(PipedWriter writer){
        this.writer=writer;
    }

    @Override
    public void run() {
        char[] array = "Hello CoreJava".toCharArray();

        try {
            writer.write(array);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}