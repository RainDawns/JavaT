package com.Day13.Fanshe;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 14:00<br/>
 *
 * @author lnh<br />
 */
public class Args {
    /*
    *可变长度参数
    *
    * 在参数列表中只能有一个   必须在列表最后一个
    *
    * 可当成一个数组对待
    *
    *
    *    * */
    public static void main(String[] args) {
        m();
        m(12,3212,3123,1234,124,12,412,4,1234,123);
    }
    public  static  void m(int... Args ){
        System.out.println("方法执行了");
        for(int i=0;i<Args.length;i++){
            System.out.println(Args[i]);
        }
    }
}
