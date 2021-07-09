package jiepu.Java.Exception;

/**
 * @author lnh
 * @date 2021年06月21日 14:07
 */
public class ExceptionTest01 {
    /*
     * Description:  简单测试注释的准确性
     * @author lnh
     * @date 2021/6/21 14:08
     * @param null
     * @return null
     */
//    public static void test1(){
//        System.out.println(Seaon.SPRING);
//        System.out.println(Seaon.SUMMER);
//        System.out.println(Seaon.AUTUMN);
//        System.out.println(Seaon.WINTER);
//
//    }
    public static void queren() throws ClassNotFoundException{
        throw new ClassNotFoundException("2");
    }
    public static void queren1() throws ClassNotFoundException{
        throw new ClassNotFoundException("2");
    }
    //JVM调用main方法   JVM不处理异常
    public static void main(String[] args)  {

//        test1();
        System.out.println("12");
        try {
            queren();
            queren1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("34");

    }
}





//enum Seaon{
//     SPRING,SUMMER,AUTUMN,WINTER
//}
