package systematicLearn.Java.homework.Day23;

/**
 * @author lnh
 * @date 2021年07月02日 15:50
 */
public class Test1 {

    public static void main(String[] args) {
        StaticTest x=Test1::m;

        CLassTest x1=Test1::n;

        Test1 te=new Test1();
        NewClassTest x2=te::o;

        ConTest x3=Test1::new;
        Test1 test = x3.test();

    }
    public static void m(int str){
        System.out.println(str);
    }
    public void n(int s,String str){
        System.out.println(s+str);
    }
    public  void o(int str){
        System.out.println(str);
    }

}
interface StaticTest{
    void test(int s);
}
interface CLassTest{
    void test(Test1 t,int s,String s1);
}
interface NewClassTest{
    void test(int s);
}
interface ConTest{
    Test1 test();
}