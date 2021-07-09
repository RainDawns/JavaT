package jiepu.Java.homework.Day13.map;

import java.util.HashMap;
import java.util.Set;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 19:41<br/>
 *
 * @author lnh<br />
 */
public class MapTest01 {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(null,"test");
        map.put(null,"gdsvgd");
        map.put(1,null);
        map.put(2,null);
        map.put(3,null);
        Set set = map.keySet();
        for (Object o:set) {
            System.out.println(o+">>.."+map.get(o));
        }
    }
}
