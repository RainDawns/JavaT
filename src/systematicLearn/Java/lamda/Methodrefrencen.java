package systematicLearn.Java.lamda;

/**
 * @author lnh
 * @date 2021年07月02日 9:23
 */
public class Methodrefrencen {

    public int m(String s){
        return 1;
    }


    public static void main(String[] args) {
//        Consumer c= System.out::println;//对象方法的引用
//        Function<String,Integer> t=Integer::valueOf;
//        System.out.println(t.apply("324234"));
//        c.accept("fdfer");
//        Xyou5 x = String::length;
//        Methodrefrencen m=new Methodrefrencen();
//        Xyou5 f=m::m;
//        System.out.println(f.test("fsdf"));

        /*
        *
        * */

//        Xyou5 x=Methodrefrencen::m;

        Xyou5 x=Stu::new;
        System.out.println(x.run("tom"));


        /*
        * 对象生成器
        * 不侵入源代码的情况下，自定义创建对象  调用方法  会自动给生成对象
        * */
/*        Supplier<Stu> s=()->{
            Stu stu=new Stu();
            stu.setAge(12);
            stu.setName("jrhug");
            return stu;
        };
        Stu stu = s.get();
        Stu stu1 = s.get();
        */


    }
}

interface Xyou5 {
//    int test(Methodrefrencen m,String s);
    Stu run(String name);
}
class Stu{
    private String name;
    private int age;

    public Stu(String name) {
        this.name = name;
    }

    public Stu() {

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
        return "Stu{" +
                "name='" + name + '\'' +
                '}';
    }
}
