package systematicLearn.Java.coreJava.test1;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/10 15:26<br/>
 *
 * @author lnh<br />
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1=new SmallStudent("雄安红");
        Student s2=new MiddleStudent("test");
        s2.study();
        s1.study();
    }
}
