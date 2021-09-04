package systematicLearn.Java.homework.Day19;

import java.io.*;

/**
 * @author lnh
 * @date 2021年06月28日 19:27
 */
public class Test05 {
    public static void main(String[] args) {
        m();
    }

    /*
     * Description:还可以使用datainputstream
     * @author lnh
     * @date 2021/7/5 16:10
     */
    public static void m(){
        BufferedReader bf=null;
        BufferedWriter bw=null;
        try {
            bf=new BufferedReader(new FileReader("z.txt"));
            String s1 = bf.readLine();
            if (null==s1){
                char[] array = "1".toCharArray();
                bw=new BufferedWriter(new FileWriter("z.txt"));
                bw.write(array,0,array.length);
            }else {
                int s=Integer.valueOf(s1);
                if (s>=10){
                    throw  new RuntimeException("请购买正版软件");
                }else {
                    s++;
                    char[] array = String.valueOf(s).toCharArray();
                    bw=new BufferedWriter(new FileWriter("z.txt"));
                    bw.write(array,0,array.length);
                }

            }
            //判断是否大于10  抛出异常
                bw.flush();
            //运行并加1存放
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bf!=null){
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
