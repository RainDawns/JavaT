package com.Day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>************************
* 放在集合中的类型需要重写equals  方法
* */
public class Collectiontest1 {
    public static void main(String[] args) {
        //接口无法实例化
        //多态
        Collection c=new ArrayList();
        c.add(2312);//自动装箱
        c.add(new Object());
        System.out.println("集合中的元素"+c.size());
        c.clear();
        c.add("hello");   //把内存地址放进去了
        c.add("jfigd");
        c.add(32423);





        /*
        * public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elementData[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }
        *
        *
        *
        * */
       boolean flag = c.contains("hello");//底层调用了equals 方法    所以这里比较的是内容
        // 不是内存地址  >>>>>>>>   string 的equals方法已经重写
        //所以即使内存地址不一样但是这里最终比较的是内容






        System.out.println(flag);
        c.remove("hello");
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        System.out.println(c.isEmpty());//是否为空




        /*
        * 遍历方式    >>>>>>Collection 中都可以使用
        *   迭代器
        *
        *集合结构发生改变   迭代器不重新获取就会发生异常
        * 在集合元素的迭代中不能调用集合的remove 方法  不然也会发生异常
        * 通过迭代器的remove方法删除不会出现异常
        * 这个迭代器类似于快照  每次迭代都会与集合中的原元素对比  不一样就会导致  异常报错
        * */
        //获取迭代器
         Iterator iterator = c.iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }
        /*System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/
    }
}
