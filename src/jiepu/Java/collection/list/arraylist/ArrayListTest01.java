package jiepu.Java.collection.list.arraylist;

import java.util.*;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/15 17:11<br/>
 *
 * @author lnh<br />
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        MyList l=new MyList(5);
        l.add(1);
        l.add(2);
        l.add("候选");
        //System.out.println(l.size());
        //System.out.println(l.get(4));
        //System.out.println(l.remove(4));
        //System.out.println(l.remove(-1));
        //l.remove(0);
        //l.clear();
        //System.out.println(l.get(-1));
        //System.out.println(l.get(0));
        //l.set(0,56);
        l.add(23);
        l.add(4324);
        l.add(3423524);
        l.add(2,"yaufaf");
        l.add(4,"yue");
        System.out.println(l);
    }
}
class MyList {

    private Object[]  arr;

    private int size ;


    public MyList(){
       this(10);
    }
    public MyList(int length){
        arr=new Object[length];
    }

    public void add(int index,Object obj){
        if(index>arr.length||index<0){
            throw  new IllegalArgumentException("请检查需要输入的位置");
        }else if (size>=arr.length){
            //扩容
            expansion();
        }else if (index>size-1){
            arr[size]=obj;
            return;
        }
        int size1=size;
        for(int i=index;size1>index+1;size1--){
            arr[size1]=arr[size1-1];
        }
        arr[index]=obj;
        size++;
    }

    public int size(){
        return size;
    }

    public void  clear(){
        for (int i = 0; i < size; i++) {
            arr[i]=null;
        }
    }

    public void add(Object obj){
        if (size>=arr.length) {
            expansion();
        }
        arr[size]=obj;
        size++;
    }
    //扩容操作
    private void expansion(){
        arr= Arrays.copyOf(arr, (int) (arr.length*1.5));
    }
    //确认传入的确保index
    private boolean confirm(int index){
        if(index>arr.length||index<0)
            throw  new IllegalArgumentException("请检查需要输入的位置");
        else if (index<=size-1)
            return true;
        return false;
    }

    public Object remove(int index){
        if(confirm(index)){
            Object obj=arr[index];
            arr[index]=null;
            for (int i = index; i < size; i++) {
                arr[i]=arr[i+1];
            }
            return obj;
        }
       throw new IllegalArgumentException("移除的下标为null");
    }

    public void  set (int index,Object obj){
        if (confirm(index)){
            arr[index]=obj;
            return;
        }
        throw new IllegalArgumentException("修改的下标为null");
    }
    public Object get (int index){
        if (confirm(index)){
            return arr[index];
        }
        return null;
    }

    @Override
    public String toString() {
        return "{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}
