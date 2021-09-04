package systematicLearn.Java.homework.Day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author lnh
 * @date 2021年06月20日 13:25
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) throws Exception{
        Class<Person> p = Person.class;
        Person person = p.newInstance();
        Constructor<Person> x = p.getDeclaredConstructor(String.class, int.class);
        Person person1 = x.newInstance("tom", 34);
        Method setName = p.getDeclaredMethod("setName", String.class);
        setName.invoke(person,"Hugo");
        Field age = p.getDeclaredField("age");
        age.setAccessible(true);
        age.set(person,45);
        Method toString = p.getDeclaredMethod("toString");
        System.out.println(toString.invoke(person));
        System.out.println(toString.invoke(person1));

        Map map=new Hashtable();

        System.out.println(">>>>>>>>>>>>");
        Constructor<Person> dc = p.getDeclaredConstructor(String.class, int.class);
        Person men = dc.newInstance("men", 34);
        System.out.println(men);

    }
}
