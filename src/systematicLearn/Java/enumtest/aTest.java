package systematicLearn.Java.enumtest;


/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/17 14:43<br/>
 *
 * @author lnh<br />
 */
public class aTest {
    public TEST test(){
        return TEST.SUMMER;
    }
    public static void main(String[] args) throws InterruptedException {
        aTest a=new aTest();
//        if (a.test()==TEST.SPIRNG){
//            System.out.println("测试成功   ");
//        }else {
//            System.out.println(TEST.SUMMER);
//        }
        a.Test();

    }
    public void Test() throws InterruptedException {
        synchronized (getClass()){
            for (int i = 0; i <100 ; i++) {
                if (i==10){
                    wait();
                }

            }
        }
    }
}
