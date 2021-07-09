package jiepu.Java.homework.Day19;

import java.io.*;

/**
 * @author lnh
 * @date 2021年06月28日 20:22
 */
public class Test07 {
    public static void main(String[] args) {
        m("data","age");
    }
    public static void m(String path,String str)  {
        if (new File(path).isDirectory()){
            throw new IllegalArgumentException("请输入正确的路径");
        }
        BufferedReader bf=null;
        StringBuilder string=new StringBuilder();
        try {
            bf=new BufferedReader(new FileReader(path));
            String s1=null;
            while ((s1=bf.readLine())!=null) {
//                System.out.println("1");
                string.append(s1);
            }
            String s = string.toString();
//            System.out.println(s);
            int count = count(s, str);
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bf!=null){
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static int count(String s,String str){
        System.out.println(s);
//        System.out.println(str);
        if (!s.contains(str)){
            return 0;
        }else {
            int count=0;
//            System.out.println(s.charAt(s.length()-1));
//            System.out.println(s.charAt(s.length()-2));
//            System.out.println(s.substring(s.length()-3,s.length()));
            if (s.substring(s.length()-3).equals(str)){
                count++;
            }else if (s.substring(0,2).equals(str)){
                count++;
            }
            String[] split = s.split(str);
            return split.length-1+count;
        }
    }
}
