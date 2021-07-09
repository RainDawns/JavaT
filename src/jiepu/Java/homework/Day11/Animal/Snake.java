package jiepu.Java.homework.Day11.Animal;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/9 16:39<br/>
 *
 * @author lnh<br />
 */
public class Snake extends Animal{
    public Snake(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("蛇在走");
    }

    @Override
    public void eat() {
        System.out.println("蛇在吃");
    }

}
