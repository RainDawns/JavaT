package com.Day10.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
*Hashmap集合：
*       1.底层是一个哈希表或者说散列表数据结构
*       2.哈希表是一个   数组加单向链表的结合体
*           单纯说数组在检索效率高   在随机增删效率低
*           单项链表   随机增删效率高    检索效率低
*         哈希表将以上两种数据结构的优点放在一起   但是没有纯其中一种数据结构的效率高
*           是两种数据结构的结合体   类似于其设计原理类似于  字典    目录就是数组   单向链表表示同一部分所有需要的
*           Hashmap的key 会调用两种方法  一个是  Hashcode    一个是equals   方法  对于放在  hashmap的对象都需要重写equals方法
*           equals 方法默认比较的是两个对象的内存地址     而现实当中  我们一般比较的是内容
*       3.  transient Node<K,V>[] table;   一个属性   底层是一个    一维数组    数组里面存放的是一个   node<K,V>  里面存放的是
                     final int hash;   hash 值    (这个数值是key的hashcode()方法的执行结果  Hash值通过Hash函数/算法，可以转换储存成数组的下标)
                     final K key;    key 值
                     V value;  values值
                     Node<K,V> next;   下个节点的 内存地址
*
*           static class Node<K,V> implements Map.Entry<K,V>   静态内部类
*
*        4.掌握Hashmap存取的原理
*        5. HashMap的key  无序  不可重复      1.因为你存储的时候放入的位置不是按顺序的而是按照key值的Hashcode 来存储
*                                                                    2.不可重复   因为存放的的时候都是按照key值的Hashcode值来查询是否含有
*                                                                       含有的话直接覆盖  所以说是不可重复的
*        6.放在Hashset的元素都是hashmap中的key 部分   所以放在hashset 中的·元素也需要重写   Hashcode 和equals 方法
*        7哈希表Hashmap 使用不当时  无法发挥其性能
*                   假设将所有的hashcode 返回一个固定值      导致哈希表 变成了一个长的单向链表
*                       也有可能便成为一个数组    返回的数值太分散
*                       这里称为    散列分布不均匀      重写hashcode  需要一定的技巧
*       8.key部分的元素的hashcode 和equals 方法都重写了
*       9.在Java8之后，HashMap做一些改变    在key值的hashcode值相同时的这条单链表  在超过8个对象时，会将单链表变成红黑树
*               当红黑树 上的对象数量小于6时，会变成 单链表    树查询效率较高      这里也是为检索效率
*
*
* */
public class HashmapTest {
    public static void main(String[] args) {
//

        /*
        key存空   但是只有  hashmap中只有一个null     面试可能遇到
        * key值相同，  values值会被覆盖
        *Hashmap 的默认容量是  16    默认加载因子是0.75
        *   默认加载因子是当Hashmap的数组容量达到容量的0.75时 开始扩容
        *   扩容之后是原来的2倍  非线程安全的
        *       +++++++++++++++++++++++++++++++++++++++
        *       重点：Hashmap初始化容量必须是2的次幂
        *           这是因为散列分布   为了提高Hashmap集合的存取效率所必须  的  这也是官方所推荐的
        *
        * */
        Map<Integer,String> map=new HashMap<>();
        map.put(342,"sdjfhsd");
        map.put(342,"sdhgfsdjh");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer,String> x:entries) {
            System.out.println(x.getKey() + "=" + x.getValue());
        }
    }
}
