package jiepu.Java.shejimoshi;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/15 9:59<br/>
 *
 * @author lnh<br />
 */
public class Singleton {
    /*
    * 单例模式
    * */
    private static Singleton instance=null;

    private Singleton() {};

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
