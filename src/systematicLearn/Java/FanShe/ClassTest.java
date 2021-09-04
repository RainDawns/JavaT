package systematicLearn.Java.FanShe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/18 14:21<br/>
 *
 * @author lnh<br />
 */
public class ClassTest {
    /*
     *
     * @author jitwxs
     * @date 2021/6/19 13:19
     * @param c
     */
    public static void getCon(Class<?> c) throws Exception {
        Object o = c.newInstance();//无参构造器可以直接构造   没有就会抛异常
        //System.out.println(o);

        //获取构造器  根据构造器创建对象
        Constructor<?>[] con = c.getDeclaredConstructors();
        for (Constructor s:con) {
            Class[] parameterTypes = s.getParameterTypes();
            for (Class c1:parameterTypes) {
//                System.out.println(c1.getSimpleName());
            }
            if (parameterTypes.length==0){
                Object o1 = s.newInstance();

//                System.out.println(o1);
            }
        }

        Constructor<?> declaredConstructor = c.getDeclaredConstructor(int.class,String.class,int.class,boolean.class);
        Object o1 = declaredConstructor.newInstance(2, "435", 21, true);
        System.out.println(o1);

    }
    /*
     *
     * @author lnh
     * @date 2021/6/19 13:20
     * @param c
     */
    public static void getFs(Class<?> c) throws Exception {
        Student s=new Student();
        Field[] fields = c.getDeclaredFields();
        for (Field  f:fields) {
            System.out.println(Modifier.toString(f.getModifiers())+"  "+ f.getType().getSimpleName()+"  "+f.getName());
            if (f.getName().equals("name")){
                f.set(s,"hfnsd");
            }
        }
    //方法的调用  invoke
    //

    }



    /*
     * 注释一些简单的注释
     * @author lnh
     * @date 2021/6/19 13:22
     * @param s1
     * @param integer
     * @return java.lang.String
     */
    public String Test(String s1,Integer integer){
        return "";
    }
    public static void main(String[] args) throws Exception {
        Class<Student> studentClass = Student.class;
//        System.out.println(studentClass);
/*

        Student stu=new Student();
        System.out.println(stu.getClass());
        Class<?> c = Class.forName("jiepu.Java.FanShe.Student");
        Class<?> aClass = Class.forName("jiepu.Java.FanShe.ClassTest");
        System.out.println(aClass);

        System.out.println(studentClass.getSuperclass());
        System.out.println(studentClass.getModifiers());
*/
//        getFs(studentClass);
        getCon(studentClass);

    }
}
