package jiepu.Java.homework.Day11.Animal;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/9 16:40<br/>
 *
 * @author lnh<br />
 */
public class Cat extends Animal{
    public Cat(int legs) {
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
