package com.Day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/*
* 字节流   读取二进制文件
*
* 字符流     只能读txt 文件
*
* */
public class IOTest {
    public static void main(String[] args) throws IOException {
        BufferedWriter wirte=new BufferedWriter(new FileWriter("testwrite"));
        wirte.write("6237ryrruwgwuirw");
        wirte.write("\n");
        wirte.write("tyuudfgusufsdu");
        wirte.flush();
        wirte.close();
    }
}
