package systematicLearn.Java.homework.Day13.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 21:23<br/>
 *
 * @author lnh<br />
 */
public class MapTest03 {
    public static void main(String[] args) {
        String s = "aabbddccaefdd";
        HashMap<Character,Integer> map=new HashMap();
        for (int i = 0; i < s.length(); i++) {
             char str=s.charAt(i);
             if (!map.containsKey(str)){
                 map.put(str,1);
             }else {
                 map.put(str,map.get(str)+1);
             }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> o: entries) {
            System.out.println(o);
        }
    }
}
