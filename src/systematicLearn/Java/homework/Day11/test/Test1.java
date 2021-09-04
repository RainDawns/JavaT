package systematicLearn.Java.homework.Day11.test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/9 16:41<br/>
 *
 * @author lnh<br />
 */
public class Test1 {
    static int count=0;
    static double sum;
    static double n1=1;
    static double n2=2;
    public static void allSum(){
        if (count>=20){
            System.out.println(sum);
            return;
        }
        double x=n2/n1;
        sum=sum+x;
        double tmp=n2;
        n2=n1+n2;
        n1=tmp;
        count++;
        allSum();
    }

    public static void main(String[] args) {
        long begin= System.currentTimeMillis();
        allSum();
        long end =System.currentTimeMillis();
        System.out.println(end-begin);
    }
}
