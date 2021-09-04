package systematicLearn.Java.coreJava.ObjectOriented;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/8 16:20<br/>
 *
 * @author lnh<br />
 */
public class Ceo  extends Employee{

    public void work(String msg) {

        super.work(msg);
        System.out.println("Ceo");
    }
}
