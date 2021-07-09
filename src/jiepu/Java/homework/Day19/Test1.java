package jiepu.Java.homework.Day19;

import java.io.File;

/**
 * @author lnh
 * @date 2021年06月28日 18:54
 */
public class Test1 {
    public static void main(String[] args) {
        m();
    }
    public static void m(){
        File f=new File("F:\\Vmware");
        System.out.println(f.exists());
        File[] files = f.listFiles();
        for (File f1:files) {
            if (f1.isDirectory()){
                System.out.println(f1);
            }
        }
    }

    public static void m1(){
        File f=new File("F:\\Vmware");
        File[] files = f.listFiles();
        for (File f1:files) {
            if (f1.isFile()){
                System.out.println(f1);
            }
        }
    }
}
