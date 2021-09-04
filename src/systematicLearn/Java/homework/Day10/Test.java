package systematicLearn.Java.homework.Day10;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/8 17:08<br/>
 *
 * @author lnh<br />
 */
public class Test {
    public static void main(String[] args) {
        Employee e1=new Worker("e1",'男',"2018/07/12","工人",200);
        Employee e2=new Manager("e1",'男',"2018/07/12","经理",10000);
        Employee e3=new Salesman("e1",'男',"2018/07/12","销售",4000,4000);
        Employee e4=new Floater("e1",'男',"2018/07/12","临时工",23);
        e1.computeSalay(35);
        e2.computeSalay(3);
        e3.computeSalay(5);
        e4.computeSalay(11);
    }
}
