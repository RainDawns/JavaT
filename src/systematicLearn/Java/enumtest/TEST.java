package systematicLearn.Java.enumtest;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/17 14:33<br/>
 *
 * @author lnh<br />
 */

/*
*
* 枚举也是类   构造器私有
*
* */

    //可以实现接口   但是不能继承因为底层还是直接使用了extends继承了java.lang.Enum
    //可以定义抽象方法    >>>>>抽象方法都在抽象类中？
public enum TEST {
    SPIRNG(""){
        @Override
        public void test1() {
            System.out.println("you");
        }
    },SUMMER("") {
        @Override
        public void test1() {

        }
    },AUTUM("") {
        @Override
        public void test1() {

        }
    },WINTER("") {
        @Override
        public void test1() {

        }
    };
    //私有构造器
    private String name;

    //有参
     private TEST(String name) {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //可以定义抽象方法
    //但是在每一个实例中实现
    public abstract  void test1();
}
