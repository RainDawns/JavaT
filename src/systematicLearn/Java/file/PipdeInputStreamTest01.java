package systematicLearn.Java.file;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author lnh
 * @date 2021年06月28日 14:18
 */
public class PipdeInputStreamTest01 {
    public static void main(String[] args) {
        PipedInputStream in=new PipedInputStream();
        PipedOutputStream out=new PipedOutputStream();
        try {
            in.connect(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.write(12);
    }
}
