package com.Day10.MapandCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(5,"fyghj");
        map.put(6,"fyutf");
        System.out.println(map.get(5));
        Set<Map.Entry<Integer, String>> maps = map.entrySet();
        for (Map.Entry<Integer,String> t:maps
             ) {
            System.out.println(t.getKey() + "=" + t.getValue());
        }
    }
}
