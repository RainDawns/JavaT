package com.Day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
* 初始化容量   默认10(底层先创建一个容量为0的数组    添加第一个元素时   才会  将数组容量变为10)
* 底层是一个  object[]数组
*  构造方法有两种   一种初始化容量
*                               一种默认容量
*
*
*arraylist 集合的库容     非线程安全的集合
*
*       扩容之后是原容量的1.5倍   >>>>>>>  位运算   右移一位
*
*
*
* 优化的话    尽可能少的扩容
* 因为底层是数组  而数组的扩容的效率极低  建议预估计元素的个数  给定初始化的容量
*
* 数组检索效率高     缺点    随机增删元素效率低   无法存储大数据量      末尾的增删不受影响        一般   查询较快较多   所以使用较多
*
*       所有集合中用的最多是     Arraylist  集合
*
*
*
* 注意  这里检索效率和下标没有关系   是由底层为数组造成的 数组的结构使得检索效率较高
* */
public class ArrayTest {
    public static void main(String[] args) {

        //二进制 右移一位
        System.out.println(10 >> 1);
        //左移一位   就是二进制  平移
        System.out.println(10 << 1);

        ArrayList arrayList=new ArrayList();
        //方法获取的是list中元素的个数
        //不是集合的容量
        System.out.println(arrayList.size());
        arrayList.add(76);


        Collection c=new HashSet();
        c.add(234);
        c.add(134);
        //将一个 hashset集合转化成list 集合
        ArrayList ar =new ArrayList(c);
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));

        }


    }
}
