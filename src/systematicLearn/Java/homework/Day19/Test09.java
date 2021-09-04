package systematicLearn.Java.homework.Day19;

import java.io.*;

/**
 * @author lnh
 * @date 2021年06月28日 23:29
 */
public class Test09 {
    public static void main(String[] args) {
        PipedReader reader=new PipedReader();
        PipedWriter writer=null;
        try {
            writer= new PipedWriter(reader);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread rea=new Readert(reader);
        Thread wri=new Writert(writer);
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

class Readert extends Thread{
    private PipedReader reader;
    public Readert(PipedReader reader){
        this.reader=reader;
    }

    @Override
    public void run() {
        try {
            int len=-1;
            FileWriter fwriter=new FileWriter("ceshi.txt",false);
            while ((len=reader.read())!=-1){
                fwriter.write(len);
            }
            fwriter.flush();
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
class Writert extends Thread{
    private PipedWriter writer;
    public Writert(PipedWriter writer){
        this.writer=writer;
    }

    @Override
    public void run() {
        char[] array = "Hello world!lnh".toCharArray();

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