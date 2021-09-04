package systematicLearn.Java.homework.Day11.test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/9 16:26<br/>
 *
 * @author lnh<br />
 */
public class FinalMethodTest {
    public static void main(String[] args) {
        FinalMethodTest test = new Sub();
        test.test();
    }
    private final void test() {
        System.out.println("父类");
    }
}
class Sub extends FinalMethodTest {
    public void test() {
        System.out.println("子类");
    }
}