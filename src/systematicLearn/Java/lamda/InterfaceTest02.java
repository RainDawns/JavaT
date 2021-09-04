package systematicLearn.Java.lamda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author lnh
 * @date 2021年07月01日 14:24
 */
public class InterfaceTest02 {
    public static void main(String[] args) {
        /*
        * 函数型
        * */
        Function<String,Integer> f=s -> 34;
        System.out.println(f.apply("rjbhwe"));
        Integer[] sp = sp(s -> s.length(), new String[]{"efdfwrfw", "k", "fwdfwe"});
        System.out.println(Arrays.toString(sp));
        /*
        * 对象  不能调用接口中的静态方法
        * */
        Function<Object, Object> identity = Function.identity();






        /*
        *供给型
        *
        * 不侵入别人的代码生成自定义的对象
        * */
        Supplier<String>  s=()->"String";
        System.out.println(s.get());


        Dog dog = NewOne(() -> {
            Dog d = new Dog();
            d.setName("dog");
            return d;
        });
        System.out.println(dog);


    }
    public  static  <T> T NewOne(Supplier<T> s){
        return s.get();
    }





    public static<T,V> Integer[] sp(Function<String,Integer>  f,String[] arr){
        List<Integer> l=new ArrayList<>();
        for (String s: arr) {
            l.add(f.apply(s));
        }
        return l.toArray(new Integer[]{});
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
