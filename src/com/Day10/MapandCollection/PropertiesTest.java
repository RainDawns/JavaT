package com.Day10.MapandCollection;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties pro =new Properties();
        pro.setProperty("576","fghdf");
        pro.setProperty("fgsdhf","dyufsd");
        String s = pro.getProperty("576") ;
        System.out.println(pro.getProperty("576"));
        System.out.println(s);
    }
}
