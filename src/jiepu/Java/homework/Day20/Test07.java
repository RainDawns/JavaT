package jiepu.Java.homework.Day20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lnh
 * @date 2021年06月29日 22:45
 */
public class Test07 {
    public static void main(String[] args) {
        replace("last.txt");
    }

    public static void replace(String path) {
        FileReader reader = null;
        FileWriter writer = null;
        boolean flag=true;
        try {
            reader = new FileReader("a.txt");
            writer = new FileWriter(path);

            int len = -1;
            while ((len = reader.read()) != -1) {
                if ((char) len == '*') {
                    if (flag){
                        writer.write("核心提示：第十二任台湾地区领导人选举今日举行，马萧(马英九、萧万长)竞选总部统计宣称已获得超过700万张\n" +
                                "选票，自行宣布当选。");
                        flag=false;
                    }
                } else {
                    writer.write(len);
                }
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
