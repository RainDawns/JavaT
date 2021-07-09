package jiepu.Java.homework.Day13;

import java.util.*;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/17 15:39<br/>
 *
 * @author lnh<br />
 */
public class CollectionTest {
    public static<T> T max(Collection<T> collection, Comparator<T> c ){
        Iterator<T> iterator = collection.iterator();
        T max=iterator.next();
        if (c==null){
            if (max instanceof Comparable){
                Comparable<T> max1=(Comparable<T>) max;
                for (T x:collection){
                    if (max1.compareTo(x)<0){
                        max1=(Comparable)x;
                    }
                }
                return (T) max1;
            }
            throw new IllegalArgumentException("需要Comparator或实现类实现Comparable");
        }else {
            for (T x:collection) {
                if (c.compare(max,x)<0){
                    max=x;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Collection<ATest> list=new ArrayList();
        list.add(new ATest("tom",34));
        list.add(new ATest("you",56));
        list.add(new ATest("hsah",45));
        System.out.println(max(list, new Comparator<ATest>() {
            @Override
            public int compare(ATest o1, ATest o2) {
                if (o1.getAge()!=o2.getAge()){
                    return o1.getAge()-o2.getAge();
                }
                return 0;
            }
        }));
        System.out.println(max(list, null));

        Collection<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(544);
        list1.add(12);
        list1.add(122);
        System.out.println(max(list1,null));

    }
}
class ATest implements Comparable{
    private String name;
    private Integer age;

    public ATest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ATest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof ATest){
            ATest a=(ATest) o;
            if (getAge()>a.getAge()){
                return 1;
            }else if (getAge()<a.getAge()){
                return -1;
            }
        }
        return 0;
    }
}
