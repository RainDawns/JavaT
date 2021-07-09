package com.Day13.bean;

import java.util.Date;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/5/30 20:36<br/>
 *
 * @author lnh<br />
 */
public class Vip {
    int no;
    String name;
    Date birth;
    boolean isvip;

    public Vip(int no) {
        this.no = no;
    }

    public Vip() {
    }

    public Vip(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Vip(int no, String name, Date birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", isvip=" + isvip +
                '}';
    }
}
