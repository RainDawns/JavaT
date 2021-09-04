package systematicLearn.Java.coreJava.test1;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/10 15:24<br/>
 *
 * @author lnh<br />
 */
public class SmallStudent extends Student{
    public SmallStudent(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println(getName()+"小学生学。。。");
    }
}
