package systematicLearn.Java.fanxing;

import java.util.*;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/17 11:04<br/>
 *
 * @author lnh<br />
 */
public class Point<T1,T2> {
    private  T1 x;
    private  T2 y;

    public Point(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public T1 getX() {
        return x;
    }

    public void setX(T1 x) {
        this.x = x;
    }

    public T2 getY() {
        return y;
    }

    public void setY(T2 y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }





    public <T> T test(T t){
        return null;
    }

    public String test1( Point<T1,T2> point){

        return "";
    }



    public static void main(String[] args) {
        Point<String,Integer> point=new Point<>("dyfsd",34);
        String x = point.getX();
        Integer y = point.getY();
        Map<String,Integer> map=new HashMap<>();
        map.put("ysdfgg",32);
        map.put("12",452);
        map.put("frg",392);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer>  entry: entries) {
            System.out.println(entry);
        }


        List<String>   list=new ArrayList<>();
        list.add("23efhfr");
        list.add("werwe");
        list.add("324rrere");
        for (String s: list) {
            System.out.println(s);
        }


        /*
        * 只能说是放空
        * */
        List<?>  l=null;
        l=new ArrayList<String>();
        l.add(null);




        List<? extends Number> list4=new ArrayList<>();
        list4=new ArrayList<yNumber>();
    }
}
class  Number {

}

class yNumber extends Number{

}
