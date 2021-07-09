package com.Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 字节输入流  从硬盘到内存
* 读取文件
* */
public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream input=null;

        try {
          input=new FileInputStream("a.txt");
    /*   int read = input.read();//读完了所有数据之后，读出了数据是-1
           System.out.println(read);*/
            //注意空格是一个字符    并不会读出-1
/*            while (true){
                 int read = input.read();
                 if (read== -1){
                     break;
                 }
                System.out.println(read);
            }*/
            int  read =0;
            while ((read=input.read()) !=-1){
                System.out.println(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (input == null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
