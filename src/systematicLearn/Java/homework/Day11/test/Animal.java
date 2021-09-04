package systematicLearn.Java.homework.Day11.test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/10 16:11<br/>
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

    public static void main(String[] args) {

    }
}
class Cat extends Animal {
    public Cat(int legs) {
        super(legs);
    }
    @Override
    public void walk() {
        System.out.println("猫在跑");
    }
    @Override
    public void eat() {
        System.out.println("猫在吃东西");
    }
}
class Fish extends Animal {
    public Fish(int legs) {
        super(legs);
    }
    @Override
    public void walk() {
        System.out.println("鱼在游");
    }
    @Override
    public void eat() {
        System.out.println("鱼在吃东西");
    }
}
class Snake extends Animal {
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
