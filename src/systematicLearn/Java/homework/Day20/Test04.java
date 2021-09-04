package systematicLearn.Java.homework.Day20;

import java.io.*;

/**
 * @author lnh
 * @date 2021年06月29日 17:16
 */
public class Test04 {
    public static void main(String[] args) {
        copy("C:\\Users\\lnh\\Desktop\\md","C:\\Users\\lnh\\Desktop\\1");
    }
    /*
     * Description: 文件夹的复制
     * @author lnh
     * @date 2021/6/29 17:17
     * @param path1  需要复制的文件夹路径
     * @param path2 存放的文件的文件夹路径
     */
    public static void copy(String path1,String path2){
        File f1=new File(path1);
        File f2=new File(path2);
        int length = f1.getAbsolutePath().length();
//        String[] split = f1.getAbsolutePath().split("\\\\");
        String path = f2.getAbsolutePath();
//        path=path+"\\"+split[split.length-1];
        File[] files = f1.listFiles();
        for (File f: files) {
            if (f.isDirectory()){
                String str = f.getAbsolutePath().substring(length);
                String p2;
                p2=path+str;
                System.out.println(p2);
                File file=new File(p2);
                if (!file.exists()){
                    file.mkdir();
                }
                copy(f.getAbsolutePath(),p2);
            }else {
                String str = f.getAbsolutePath().substring(length);
                String p1;
                p1=path+str;
                BufferedInputStream in=null;
                BufferedOutputStream out=null;
                try {
                    in=new BufferedInputStream(new FileInputStream(f.getAbsolutePath()));
                    out=new BufferedOutputStream(new FileOutputStream(p1));
                    int len=-1;
                    while ((len=in.read())!=-1){
                        out.write(len);
                    }
                    out.flush();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if (in!=null){
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (out!=null){
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }

    }
}
