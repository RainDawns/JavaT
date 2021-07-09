package jiepu.Java.homework.Day12;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/11 16:10<br/>
 *
 * @author lnh<br />
 */
public class Test{
    public static void main(String[] args) {
        UseCompute useCompute=new UseCompute();
        Compute[] com={new Add(),new Subtract(),new Multiply(),new Divide()};
        for (int i = 0; i < com.length; i++) {
            useCompute.useCom(com[i],21,21);
        }

    }
}
 interface Compute {
    int computer(int n,int m);
}
class Add implements Compute {

    @Override
    public int computer(int n, int m) {
        return n+m;
    }
}
class Subtract implements Compute{
    @Override
    public int computer(int n, int m) {
        return n-m;
    }
}
class Multiply implements Compute{

    @Override
    public int computer(int n, int m) {
        return n*m;
    }
}
class Divide implements Compute{

    @Override
    public int computer(int n, int m) {
        return n/m;
    }
}
class UseCompute {
    public void useCom(Compute com,int one,int two){
        System.out.println(com.computer(one, two));
    }
}
