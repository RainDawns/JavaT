package com.Day10.MapandCollection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistTest {
    public static void main(String[] args) {
        List mylist=new ArrayList();
        mylist.add("567");
        mylist.add(324);
        for (Object x:mylist
             ) {
            System.out.println(x);
        }
    }
}
