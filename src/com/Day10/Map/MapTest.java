package com.Day10.Map;
//

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

/*
* map  和collection  没有关系
* map 以key 与values  存储
*   以　　ｋｅｙ为主要关系
*
*
* */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("test","123");
        map.put("tyu","rtyu");
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        String str=new String("test");
        System.out.println(map.containsKey("test"));
        System.out.println(map.containsKey(str));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(">>>>>>>>>>>>>>>>>");
        Collection<String> values = map.values();
        System.out.println(values);
        //map.clear();
       // map.remove("test");
        System.out.println(map.entrySet());//map集合转化成set集合   返回的对象是这个类型  泛型<Map.Entry<K, V>>
        System.out.println(map.get("test"));




        /*
        两种方式遍历
        *   遍历map   :   1.map集合转化成set集合   返回的对象是这个类型  泛型<Map.Entry<K, V>>
        map.entrySet()将map集合转化成set 集合
        * */
        System.out.println("888888888888888888888888888");
        Set<Map.Entry<String, String>> set = map.entrySet();
        /*
        * 两种方式    一种是迭代器  一种是foreach
        *
        * */
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> t= (Map.Entry<String, String>) iterator.next();
            System.out.println(t.getKey() + "=" + t.getValue());

        }
        for (Map.Entry<String,String> x:set
             ) {
            System.out.println(x.getKey() + "---->>>>" + x.getValue());
        }




        /*
        * 1.获取所有的key   遍历key 获取所有的values
        *  效率低   大数据量一般选择上面的
        *
        *
        * */
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        Set<String> strings = map.keySet();

        /*
        两种方式  一种是foreach   一种是迭代器   记住使用迭代器的时候  别选择lang包下的   而是   utill包下的
        * */
        /*        Iterator iterator=strings.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            String s= (String) o;
            System.out.println(s+"="+map.get(s));
        }*/
        for (String string:strings
             ) {
            System.out.println(string+"="+map.get(string));
        }
    }
}
