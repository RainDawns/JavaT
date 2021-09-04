package systematicLearn.Java.coreJava.ObjectOriented;

import java.util.Random;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 9:41<br/>
 * @author lnh<br />
 */
public class StudentTest {
    public static void main(String[] args) {
        int[] a={12,12,12};
        System.out.println(a.toString());

        Student stu=new Student("雨晓",'男');
        stu.setName("you");
        System.out.println(stu.toString());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String name = stu.getClass().getSimpleName();
        System.out.println(name);

        int r=new Random().nextInt(100);
        System.out.println(r);

    }
}
