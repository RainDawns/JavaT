package systematicLearn.Java.homework.Day13.Collection;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 19:59<br/>
 *
 * @author lnh<br />
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        Set<Teacher> set=new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {

                    if (!o1.getName().equals(o2.getName())){
                        String s1 = o1.getName();
                        String s2 =  o2.getName();
                        int len1 = s1.length();
                        int len2 = s2.length();
                        int lim = Math.min(len1, len2);
                        char v1[] = s1.toCharArray();
                        char v2[] = s2.toCharArray();
                        int k = 0;
                        while (k < lim) {
                            char c1 = v1[k];
                            char c2 = v2[k];
                            if (c1 != c2) {
                                return c1 - c2;
                            }
                            k++;
                        }
                        return len1 - len2;
                    }else if (o1.getAge()!=o2.getAge()){
                        return o1.getAge()-o2.getAge();
                    }else if (o1.getId()!=o2.getId()){
                        return o1.getId()-o2.getId();
                    }

                return 0;
            }
        });
        set.add(new Teacher(121,"tom",23));
        set.add(new Teacher(122,"tom",23));
        set.add(new Teacher(122,"tom",24));
        set.add(new Teacher(123,"tom",24));
        set.add(new Teacher(121,"you",23));
        set.add(new Teacher(121,"er",23));
        for (Teacher o: set) {
            System.out.println(o);
        }

    }
}
class Teacher/* implements Comparable*/{
    private int  id;
    private  String name;
    private  int age;

    public Teacher(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && age == teacher.age && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

/*    @Override
    public int compareTo(Object o) {
        if (o instanceof Teacher){
            Teacher t=(Teacher) o;
            if (!t.name.equals(name)){
                String s1 = t.name;
                String s2 =  name;
                int len1 = s1.length();
                int len2 = s2.length();
                int lim = Math.min(len1, len2);
                char v1[] = s1.toCharArray();
                char v2[] = s2.toCharArray();
                int k = 0;
                while (k < lim) {
                    char c1 = v1[k];
                    char c2 = v2[k];
                    if (c1 != c2) {
                        return c2 - c1;
                    }
                    k++;
                }
                return len2 - len1;
            }else if (t.age!=age){
                return t.age-age;
            }else if (t.id!=id){
                return t.id-id;
            }
        }
        return 0;
    }*/

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
