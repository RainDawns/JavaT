package jiepu.Java.collection.list.arraylist;

import java.util.*;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/15 15:17<br/>
 *
 * @author lnh<br />
 */
public class ArraylistTest {
    public static void main(String[] args) {

        /*
        * 数组的查询为快
        * 首先：1.分配的空间时连续的
        *           2.可以通过下标直接查询
        *           3.每个数组空间大小一样   可以通过地址来找
        *
        * */
        List c=null;
        /*
        * 数组查询
        *   查询
        * 末尾进行插入删除不受影响
        * */
        c=new ArrayList();
        /*
        * 易于插入和删除
        * 双向链表实现
        * 非连续的空间    查询效率较低
        * */
        //c=new LinkedList();
        /*
        * 安全效率低
        *  线程安全的
        * */
        //c=new Vector();
//        c.add("iueriewf");
        c.add("2");
        c.add("32");
        //c.clear();
        c.isEmpty();



        /*
        * list.foreach      //消费式函数
        *
        *
        * lambda  表达式第一式
        * */
        System.out.println(">>>>>>>>>>>");
        c.forEach(System.out::println);



        c.forEach(item-> {
            if ("2".equals(item))
            System.out.println(item);
        });


        System.out.println(".>>>>>>>>");
        Iterator it = c.iterator();
        for (; it.hasNext();) {
            Object o = it.next();
            System.out.println(o);
        }

        for (Object o: c) {
            System.out.println(o);
        }
        HashMap map=new HashMap();
        map.put(1,2);
    }
}
