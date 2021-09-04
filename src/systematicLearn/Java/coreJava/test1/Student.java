package systematicLearn.Java.coreJava.test1;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/10 15:23<br/>
 *
 * @author lnh<br />
 */
public abstract class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void study();
}
