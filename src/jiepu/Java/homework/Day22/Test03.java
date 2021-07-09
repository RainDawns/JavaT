package jiepu.Java.homework.Day22;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lnh
 * @date 2021年07月01日 16:33
 */
public class Test03 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("we",12);
        map.put("fds",56);
        map.put("sxw",45);
        map.forEach((x,y)-> System.out.println(x+"="+y));
    }
}
