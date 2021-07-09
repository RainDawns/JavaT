package jiepu.Java.coreJava.ObjectOriented;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 14:38<br/>
 * @author lnh<br />
 */
public class EmTest {
    public static void main(String[] args) {
        Employee e1=new Manager("manager");
        Employee e2=new Ceo();
        Person person=new Person();
        person.start(e1,"经理");
        person.start(e2,"Ceo");
        System.out.println(e2 instanceof Ceo);
        Ceo ceo=(Ceo)e2;
        ceo.work("checking ");
    }
}
