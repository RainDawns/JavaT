package jiepu.Java.homework.Day15.zhujie;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lnh
 * @date 2021年06月20日 13:42
 */
public class ParseMyAnno {
    @MyBefore
    public void test1(){
        System.out.println("MyBefore运行");
    }

    @MyTest
    public void test2(){
        System.out.println("MyTest运行");
    }

    @MyTest
    public void test4(){
        System.out.println("MyTest2运行");
    }

    @MyAfter
    public void test3(){
        System.out.println("MyAfter运行");
    }



    public static void parse() throws Exception{
        Class<ParseMyAnno> parseMyAnnoClass = ParseMyAnno.class;
        Method[] methods = parseMyAnnoClass.getDeclaredMethods();
        List<Method> listbefore=new ArrayList<>();
        List<Method> listnow=new ArrayList<>();
        List<Method> listafter=new ArrayList<>();
        ParseMyAnno pran = parseMyAnnoClass.newInstance();
        for ( Method m: methods) {
                if (m.isAnnotationPresent(MyBefore.class)){
                    listbefore.add(m);
                }else if (m.isAnnotationPresent(MyTest.class)){
                    listnow.add(m);
                }else if (m.isAnnotationPresent(MyAfter.class)){
                    listafter.add(m);
                }
        }

        for ( Method m:listbefore ) {
            m.invoke(pran);
        }
        for ( Method m:listnow ) {
            m.invoke(pran);
        }
        for ( Method m:listafter ) {
            m.invoke(pran);
        }

    }


    public static void main(String[] args) throws Exception {
        parse();
    }

}
