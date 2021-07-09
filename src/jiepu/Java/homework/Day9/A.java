package jiepu.Java.homework.Day9;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.*;//1.5版本以上
/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 22:39<br/>
 *
 * @author lnh<br />
 */
public class A{
        protected int test(){
            return 0;
        }
    class B extends A {
        public int test() {
            return 0;
        }
    }

    public static void main(String[] args) {
/*         Integer x=new Integer(20000);
        Integer x1=new Integer(10);*/
        Collections.synchronizedList(new ArrayList<>());


        Integer x3=Integer.valueOf(127);
        Integer x4=Integer.valueOf(127);
         int y=10;
        System.out.println(x3==x4);
        //int 和Integer  相等数值为true

        //integer.valueof      相同数值小于128相比true    大于等于128  false
        System.out.println(PI);
    }
}
