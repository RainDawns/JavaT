package jiepu.Java.homework.Day12;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/11 16:35<br/>
 *
 * @author lnh<br />
 */
import java.util.Date;
 public class SuperTest extends Date {
       private static final long serialVersionUID = 1L;
       private void test(){
           System.out.println(super.getClass().getName());
           System.out.println(this.getClass().getSuperclass().getSuperclass().getSimpleName());
       }
       public static void main(String[] args) {
           new SuperTest().test();
       }
 }




