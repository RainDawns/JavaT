package com.Day10.Map;

import java.util.Objects;

public class Student  {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //这里没重写equals方法  和hashcode 方法
    public  boolean equals(Object obj){
        if (obj==null | ! (obj instanceof Student) ) return false;
        if (obj ==this) return true;
        Student s= (Student) obj;
         if (this.name.equals(s.name)) return true;
         return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

