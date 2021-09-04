package systematicLearn.Java.homework.Day9.test3;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 22:34<br/>
 *
 * @author lnh<br />
 */
public class CarTest {
    public static void main(String[] args) {
        Car c=new Car("宝马"," ","两厢");
        moreCars c1=new moreCars("","",16);
        System.out.println(c.getsumrent(5));
        System.out.println(c1.getsumrent(3));
    }
}
