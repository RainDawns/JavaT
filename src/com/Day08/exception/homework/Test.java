package com.Day08.exception.homework;

public class Test {
    public static void main(String[] args) {
        Uservice uservice=new Uservice();
        try {
            uservice.residter("5shd","dgh76sdhd");

        } catch (ErrorException e) {
            System.out.println(e.getMessage());
        }
    }

}
