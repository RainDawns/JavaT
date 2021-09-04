package systematicLearn.Java.coreJava.test1;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/10 15:25<br/>
 *
 * @author lnh<br />
 */
public class MiddleStudent extends Student{
    public MiddleStudent(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println(getName()+"中学生学....");
    }
}
