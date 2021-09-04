package systematicLearn.Java.homework.Day16;

/**
 * @author lnh
 * @date 2021年06月21日 19:11
 */
public class Return1 {
    public static void main(String[] args) {
        System.out.println(testReturn2());
    }
    private static Test testReturn2() {
//        List<Test> list = new ArrayList<>();
        Test tom = null;
        try {
            tom= new Test("tom", 12);
            System.out.println("try:" + tom);
            return tom;
        } finally {
            tom.setAge(12312);
            System.out.println("finally:" + tom);
        }
    }
}
class Test{
    private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
