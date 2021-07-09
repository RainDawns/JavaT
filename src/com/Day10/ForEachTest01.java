package com.Day10;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest01 {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        mylist.add("t7889");
        mylist.add("7ffghjfgh");
        mylist.add("gghjkh");
        for (String str :mylist
             ) {
            System.out.println(str);
        }
    }
}
