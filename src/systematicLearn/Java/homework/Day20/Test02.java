package systematicLearn.Java.homework.Day20;

import java.io.File;

/**
 * @author lnh
 * @date 2021年06月29日 16:41
 */
public class Test02 {
    public static void main(String[] args) {
        find("C:\\Users\\lnh\\Desktop\\md");
    }


    public static void find(String path){
        File file=new File(path);
        File[] files = file.listFiles();
        for (File f: files) {
            if (f.isDirectory()){
                System.out.println("文件夹  "+f);
                find(f.getAbsolutePath());
            }else {
                System.out.println("文件  "+f);
            }
        }

    }
}
