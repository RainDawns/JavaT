package jiepu.Java.homework.Day12;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/11 18:59<br/>
 *
 * @author lnh<br />
 */
public class OuterDemo {

    public static void main(String[] args) {
        Outer.method().show();
    }

}
    interface Inter {
        void show();
    }
    class Outer {
        public static Inter method(){
            return new Inter() {
                @Override
                public void show() {
                    System.out.println("HelloWorld");
                }
            };
        }
    }


