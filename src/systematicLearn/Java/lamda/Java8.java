package systematicLearn.Java.lamda;

import java.util.TreeSet;

/**
 * @author lnh
 * @date 2021年07月01日 9:28
 */
public class Java8 {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>((o1,o2)-> o2-o1);
        set.add(23);
        set.add(34);
        set.add(29);
        System.out.println(set);



        Test t=()-> 0;
        System.out.println(t.c());

        Test.s();
    }
    public static void est(){

    }
}
interface Test{
    int c();
    static void s(){
    }
}
class Ex implements Test{
    @Override
    public int c() {
        return 0;
    }
}

