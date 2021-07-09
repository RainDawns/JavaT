package com.Day10.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 集合工具类
*
* */
public class ConllectioinsTest {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Collections.synchronizedList(list);
        list.add(new Student("hfd"));
        list.add(new Student("abc"));
        list.add(new Student("ect"));
       /* Collections.sort(list)*/;             //>>>>>>>>>>>>>>>>>>>>>>>要求元素类继承compare接口   比较类  或者 传入比较器
    }
}
