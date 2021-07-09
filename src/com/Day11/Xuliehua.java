package com.Day11;
/*
* 序列化和反序列化
*
* */
import java.beans.Transient;
import java.io.*;
//         Serializable这是一个标志接口，给java虚拟机参考的  从而自动生成序列化1版本号
//

/*
* */
public class Xuliehua {
    public static void main(String[] args) throws IOException {
        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("etst"));//反序列化
        //序列化的对象需要继承         Serializable  这个接口   以此来实现序列化和反序列化   建议固定一个版本号
        //序列化多个对象时，需要使用集合  不然的话会报错
        //对象的某个字段不参与序列化只需要  加一个         Transient  关键字



    }
}
