package jiepu.Java.homework.Day20;

import java.io.*;
import java.util.ArrayList;

/**
 * @author lnh
 * @date 2021年06月29日 19:03
 */
public class Test05 {
    public static void main(String[] args) {
        BufferedReader reader=null;
        BufferedWriter writer=null;
        try {
            reader=new BufferedReader(new FileReader("a.txt"));
            writer=new BufferedWriter(new FileWriter("a1.txt"));

            ArrayList<String> list=new ArrayList<>();
            String str=null;
            while ((str=reader.readLine())!=null){
                list.add(m(str));
                System.out.println(m(str));
            }

            for (int i = list.size()-1; i >-1 ; i--) {
                System.out.println(list.get(i));
                writer.write(list.get(i));
                writer.write("\r\n");

            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    public static String m(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
