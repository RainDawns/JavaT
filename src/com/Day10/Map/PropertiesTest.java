package com.Day10.Map;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.put("url","567689cfjhk");
        properties.setProperty("6789","5678");
        System.out.println(properties.get("url"));
    }
}
