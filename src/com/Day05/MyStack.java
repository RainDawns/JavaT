package com.Day05;

public class MyStack {
    private Object[] a;
    private  int index;


    /*
    * 弹栈：往外取元素
    * */
    public Object POP(){
        if(index>-1){
            Object p=a[index];
            a[index]=null;
            index=this.index-1;
            return p;
        }
        return "栈已空";
    }

    public void push(Object obj){
        if(index>this.a.length-1){
            System.out.println("压栈错误");
        }
        index=this.index+1;
        a[index]=obj;
        System.out.println("压" + obj + "栈栈成功" + "栈帧指向" + index);
    }
    public MyStack() {
        this.a= new Object[10];
        this.index=-1;
    }

    public MyStack(Object[] a) {
        this.a = a;
    }

    public Object[] getA() {
        return a;
    }

    public void setA(Object[] a) {
        this.a = a;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
