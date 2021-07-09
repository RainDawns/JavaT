package com.Day10.FanXing;


import java.util.ArrayList;
import java.util.List;

/*
* 泛型    编译阶段而不是   运行阶段
*
* 集合不使用泛型   分析程序的缺点
*
*
*
* */
public class GenericTest {
    public void main(String[] args) {

        //JDK5.0之后的新特性     使用泛型之后    统一了集合之中的元素的类型     使用<> 都表示可以使用泛型
        List<Animal> mylist = new ArrayList<Animal>();
        //使用迭代器  取出来的元素类型都是泛型指定的类型   不是object
        //缺点  集合中的元素类型  单一  只可以存储一种类型
        // 不使用的话  都是 需要  instanceof  向下转型
        tmo<String> tmo=new tmo<>();
         String s = tmo.get();
    }
    class Animal{

    }
//泛型这里可以自己随便写   但一般写  E或者T      自定义泛型
    public class tmo<cashcjba>{
        String text;
        public cashcjba get(){
            return null;
        }
    }
}
