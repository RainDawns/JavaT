package systematicLearn.Java.homework.Day13;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 15:35<br/>
 *
 * @author lnh<br />
 */
public class Test {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(A.num);
    }
}
//⽗类A
class A {
    public static int num;
    static{
        num = 2;
        System.out.println("a");
    }
    {
        num = 3;
        System.out.println("a()");
    }
}
//⼦类B
class B extends A {
    {
        super.num = 4;
    }
}



//⽗类A
/*
class A {
    public static int num;
    static{
        num = 2;
        System.out.println("a");
    }
    {
        num = 3;
        System.out.println("a()");
    }
}
//⼦类B
class B extends A {
    {
        super.num = 4;
    }
}*/
