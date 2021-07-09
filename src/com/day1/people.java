package com.day1;

public class people {
    String name;
    Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void say(){
        System.out.println("name:"+name+"===="+"age:"+age);
    }
}
