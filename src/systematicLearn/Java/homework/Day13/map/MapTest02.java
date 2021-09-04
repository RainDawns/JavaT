package systematicLearn.Java.homework.Day13.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 20:28<br/>
 *
 * @author lnh<br />
 */
public class MapTest02 {
    public static void main(String[] args) {
        Map<String,Double> map=new HashMap<>();
        map.put("香蕉",5.6);
        map.put("樱桃",25.0);
        map.put("桃子",5.6);
        map.put("苹果",2.3);
        Set<String> set = map.keySet();
        System.out.println("水果的种类："+set.size());
        for (String o: set) {
            System.out.println(o+"="+map.get(o));
        }
        Set<Map.Entry<String,Double>> entrySet = map.entrySet();
        System.out.println("水果的种类："+entrySet.size());
        for ( Map.Entry<String,Double> o: entrySet) {
            System.out.println(o);
        }

        map.put("香蕉",10.9);
        map.remove("桃子");
        Set<Map.Entry<String,Double>> entrySet1 = map.entrySet();
        System.out.println("水果的种类："+entrySet.size());
        for ( Map.Entry<String,Double> o: entrySet1) {
            System.out.println(o);
        }
    }
}
