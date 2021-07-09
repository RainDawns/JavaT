package jiepu.Java.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lnh
 * @date 2021年06月23日 18:47
 */
public class HashSetTest02 {
    public static void main(String[] args) {
        /*
        * 第一次存入的时候   使用的1+tom 的hash值
        *  将s1.age 改为10的时候
        *
        * 使用remove的时候  用10+tom的hash值去找所以就没有
        *
        * 第二次添加的时候  用的tom+1的hash值 添加    但是内容不同  equals 方法的作用   又可以添加进去
        *
        *
        * 第三次添加的时候使用的是使用 10+tom的hash值去添加  但是里面根本就没有这个hash值  所以可以直接添加   成功
        *
        *
        * 所以造成现在的这个场面
        *
        * 这个无序不重复的set集合使用的问题在这里
        *
        * */
        Set<Student> set =new HashSet<>();
        Student s1=new Student("tom",1);

        set.add(s1);
        s1.setAge(10);
        System.out.println(set.remove(s1));
        System.out.println(set);
        set.add(new Student("tom",1));
        System.out.println(set);

        set.add(new Student("tom",10));
        System.out.println(set);

    }
}
