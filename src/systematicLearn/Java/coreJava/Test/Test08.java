package systematicLearn.Java.coreJava.Test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/4 16:25<br/>
 *
 * @author lnh<br />
 */
public class Test08 {
    int num=1;
   // int s=1;
    public void factorial(int num1,int key){
        if(num1>key){
            System.out.println(num);
            return;
        }
        num=num*num1;
        num1++;
        factorial(num1,key);
    }

/*    public void factorial1(int key){
        if (num>key){
            System.out.println(s);
            return ;
        }
        num++;
        s=s*num;
        factorial1(key);
    }*/

    public  int diGui(int n) {
        if(n==1) {
            return 1;
        }else {
            return diGui(n-1)*n;
        }
    }


    public static void main(String[] args) {
        Test08 te=new Test08();
        //te.factorial(te.num, 10);
       // te.factorial1(10);
        System.out.println(te.diGui(10));
    }
}
