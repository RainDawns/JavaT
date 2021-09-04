package systematicLearn.Java.homework.Day13.Collection;


import java.util.Arrays;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 18:48<br/>
 *
 * @author lnh<br />
 */
public class ArrayListTest05 {
    public static void main(String[] args) {
        MyList l = new MyList1(5);
        l.add(1);
        l.add(2);
        l.add("候选");
        System.out.println(l.size());
        System.out.println(l.remove(2));
        System.out.println(l.get(0));
        l.set(0,56);
        l.add(3423524);
        l.add(2, "yaufaf");
        l.add(4, "yue");
        l.add(6,"ds");
        System.out.println(l);
    }
}


interface MyList{
    public void add(int index,Object obj); //在指定位置添加对象
    public void add(Object obj); //在数据结构最后位置添加对象
    public Object remove(int index); //删除指定位置上的对象
    public void set(int index,Object obj); //修改指定位置上的数据
    public Object get(int index); //获取指定位置上的数据
    public int size(); //获取当前数据结构当前的长度
    public void clear(); //清空所有的数据
}

class MyList1 implements MyList {

    private Object[]  arr;

    private int size ;


    public MyList1(){
        this(10);
    }
    public MyList1(int length){
        arr=new Object[length];
    }

    public void add(int index,Object obj){
        if (size>=arr.length){
            //扩容
            expansion();
        }
        if(index>arr.length||index<0){
            throw  new IllegalArgumentException("请检查需要输入的位置");
        }else if (arr[index]==null){
            arr[index]=obj;
            size++;
            return;
        }else {
            for (int i= index+1;i<arr.length;i++){
                while (arr[i]==null){
                    for (;i>index;i--){
                        arr[i]=arr[i-1];
                    }
                    arr[index]=obj;
                    size++;
                    return;
                }
            }
        }
    }


    public int size(){
        return size;
    }

    public void  clear(){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=null;
            size=0;
        }
    }

    public void add(Object obj){
        if (size>=arr.length) {
            expansion();
        }
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==null) {
                arr[size] = obj;
                size++;
                return;
            }
        }
    }
    //扩容操作
    private void expansion(){
        arr= Arrays.copyOf(arr, (int) (arr.length*1.5));
    }
    //确认传入的确保index
    private boolean confirm(int index){
        if(index>arr.length||index<0)
            throw  new IllegalArgumentException("请检查需要输入的位置");
        return true;
    }

    public Object remove(int index){
        if(confirm(index)){
            if (arr[index]!=null){
                Object obj=arr[index];
                arr[index]=null;
                size--;
                return obj;
            }
        }
        throw new IllegalArgumentException("移除的下标值为null");
    }


    public void  set (int index,Object obj){
        if (confirm(index)){
            arr[index]=obj;
            return;
        }
    }

    public Object get (int index){
        if (confirm(index)){
            if (arr[index]!=null) {
                return arr[index];
            }
        }
        throw new IllegalArgumentException("下标值为空");
    }

    @Override
    public String toString() {
        return "{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}

