package systematicLearn.Java.homework.Day22;

import java.util.function.Consumer;

/**
 * @author lnh
 * @date 2021年07月01日 18:44
 */
public class Test09 {
    public static void main(String[] args) {
        Consumer<String> c=s ->{
            String[] split = s.split(",");
            System.out.print(split[0]+":"+split[1]+"  ");
        };
        Consumer<String> c1 = c.andThen(s -> {
            String[] split = s.split(",");
            if (split[0].length()==3&&split[1].equals("男")){
                System.out.println("姓名：" + split[0] + ", 性别：" + split[1]);
            }else {
                System.out.println();
            }
        });
        printer(new String[] {"卢本伟,男","五五开,女","white,男"},c1);

    }

    public static <T> void printer(T[] t, Consumer<T> c){
        for (T t1:t){
            c.accept(t1);
        }
    }
}