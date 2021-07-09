package jiepu.Java.homework.Day22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author lnh
 * @date 2021年07月01日 16:23
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        Collections.addAll(list,"342","tyu","34234","342","you","tyu");
        ArrayList<String> a=new ArrayList<>();
        list.forEach(s ->{
            if(!a.contains(s)){
                a.add(s);
            }
        });
        System.out.println(a);
    }
}
