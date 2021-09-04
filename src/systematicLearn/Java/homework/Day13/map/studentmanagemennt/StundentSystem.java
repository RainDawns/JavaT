package systematicLearn.Java.homework.Day13.map.studentmanagemennt;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 21:39<br/>
 * @author lnh<br />
 */
public class StundentSystem {
    private Map<String,Student> map;

    public StundentSystem(){
        map=new HashMap<>();
    }
    public boolean add (Student student){
        map.put(student.getId(),student);
        return true;
    }

    public boolean delete (String id){
        if (map.containsKey(id)){
            map.remove(id);
            return true;
        }
        return false;
    }

    public void show (){
        Set<Map.Entry<String,Student>> entrySet = map.entrySet();
        for (Map.Entry<String,Student> o: entrySet) {
            System.out.print(o+"\t");
        }
        System.out.println();
    }

    public Student select (String id){
        if (map.containsKey(id)){
            return  map.get(id);
        }
        return null;
    }

}
