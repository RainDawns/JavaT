package systematicLearn.Java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 11:17<br/>
 *
 * @author lnh<br />
 */

/*
*  三种  遍历方式
*  1.生成Map.Entry来遍历>>>>  set集合
*
* 1.1  迭代器遍历
*
* 1.2 增强for循环 >>>>foreach
*       Map<Integer,String>  map=new HashMap<>();
        map.put(21,"张三");
        System.out.println(map.size());
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer,String> set:entrySet) {
            System.out.println(set.getKey()+":"+set.getValue());
        }
*
*
* 2.获取所有的key值 用set集合存放 然后遍历set  并得到values
*
*
*
* */
public class MapTest01 {
    public static void main(String[] args) {
/*        Map<Integer,String>  map=new HashMap<>();
        map.put(21,"张三");
        System.out.println(map.size());
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer,String> set:entrySet) {
            System.out.println(set.getKey()+":"+set.getValue());
        }
        */
        Map map=new HashMap();
        Student s1=new Student("sandy",20);
        Student s2=new Student("sandy",20);
        map.put(s1,"test");
        map.put(s2,"hdahd");
        System.out.println(map.size());

    }
}
