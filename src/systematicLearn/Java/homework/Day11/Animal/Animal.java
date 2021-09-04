package systematicLearn.Java.homework.Day11.Animal;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/9 16:38<br/>
 *
 * @author lnh<br />
 */
public abstract class Animal {
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
    public abstract void walk();
    public abstract void eat();
}
