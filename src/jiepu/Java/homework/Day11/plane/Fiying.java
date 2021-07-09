package jiepu.Java.homework.Day11.plane;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/10 18:43<br/>
 *
 * @author lnh<br />
 */
public interface Fiying {
    void fly();
}
class Bird implements Fiying{

    @Override
    public void fly() {
        System.out.println("鸟在飞");
    }
}
class Plane implements Fiying{

    @Override
    public void fly() {
        System.out.println("飞机在飞");
    }
}