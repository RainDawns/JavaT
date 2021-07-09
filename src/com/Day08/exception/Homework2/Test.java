package com.Day08.exception.Homework2;


public class Test {
    public static void main(String[] args) {
        Army army=new Army(4);

        yunshuji yunshuji=new yunshuji();
        dapao dapao=new dapao();
        feiji feiji=new feiji();
        youting youting=new youting();
        feiji feiji2=new feiji();
        feiji feiji3=new feiji();
        try {
            army.adawuqi(yunshuji);
            army.adawuqi(dapao);
            army.adawuqi(feiji);
            army.adawuqi(youting);
            army.adawuqi(feiji2);
            army.adawuqi(feiji3);
        } catch (WuqioutpionterException e) {
            e.printStackTrace();//e.getMessage()是一个字符串并没有打印的功能   默认使用  printStackTrace()
        }
        army.attack();
        army.move();
    }
}

