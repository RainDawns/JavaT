package systematicLearn.Java.homework.Day15.test01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lnh
 * @date 2021年06月20日 14:05
 */
public class ObjectPool {
    private Map<String,Object>  objectMap;

    public void initPool() throws Exception{
        Map<String,String> map=new HashMap<>();
        map.put("student","jiepu.Java.homework.Day15.test01.Student");
        map.put("teacher","jiepu.Java.homework.Day15.test01.Teacher");
        objectMap=new HashMap<>();
        Set<String> strings = map.keySet();
        for (String s: strings) {
            Class<?> c = Class.forName(map.get(s));
            objectMap.put(s,c.newInstance());
        }
    }


    public Object getObject(String name){
        if (name.equals("")||!objectMap.containsKey(name)){
            throw new IllegalArgumentException("非法输入,未把对象添加到对象池");
        }else if (objectMap.containsKey(name)){
            return objectMap.get(name);
        }
        return null;
    }


    public static void main(String[] args) throws Exception {
        ObjectPool pool= new ObjectPool();
        pool.initPool();
        System.out.println(pool.getObject("student"));
        System.out.println(pool.getObject("teacher"));


        Map<Class,String> s=new HashMap<>();
        s.put(String.class,"String.class");
        Set<Map.Entry<Class, String>> entries = s.entrySet();
        for (Map.Entry<Class, String> entry:entries) {
            System.out.println(entry);
        }
    }

}
