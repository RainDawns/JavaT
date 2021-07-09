package com.Day08.exception.Homework2;
/*
* 类强制性转换成 接口的时候  可以没有继承关系
*
*
* */
public class Army {
    private wuqi[] wuqis;
    /*
    * 构造方法
    * 创建一个数据
    * */
    public Army(int count){
        wuqis=new wuqi[count];
    }

    public void adawuqi(wuqi wuqi) throws WuqioutpionterException {
        for (int i = 0; i <wuqis.length; i++) {
                if (null==wuqis[i]){
                    wuqis[i]=wuqi;
                    return;
                }
        }
        throw new WuqioutpionterException("武器库已满");
    }

    public void attack(){
        for (int i = 0; i < wuqis.length; i++) {
            if (wuqis[i] instanceof shotable){
                /*
                * 多态：向下转型
                *
                * 看他是否为这个接口的   不是的话    运行的时候还是会报错
                *
                * */
                shotable shotable= (shotable) wuqis[i];
                shotable.shot();
            }
        }
    }

    public void move(){
        for (int i = 0; i < wuqis.length; i++) {
            if (wuqis[i] instanceof moveable){
                moveable moveable= (moveable) wuqis[i];
                moveable.move();
            }
        }
    }

}
