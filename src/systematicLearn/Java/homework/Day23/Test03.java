package systematicLearn.Java.homework.Day23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lnh
 * @date 2021年07月02日 16:47
 */
public class Test03 {
    public static void main(String[] args) {
//        ()
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"水煮鱼","酸菜鱼","麻辣鱼",
                "麻婆豆腐","回锅肉","鱼香肉丝","水煮肉片","宫保鸡丁","剁椒鱼头","夫妻肺片");
        list.stream()
                .filter(s -> s.length() == 3)
//                .filter(s -> s.contains("鱼"))
                .forEach(System.out::println);
        System.out.println(list.stream()
                .filter(s -> s.contains("鱼"))
                .count());


    }
}
