package jiepu.Java.Exception;

/**
 * @author lnh
 * @date 2021年06月21日 16:14
 */
public class ExceptionTest02 {

    public static int  tst(){
        /*
        * 类似于if-else if-else
        *但是if-else  中一个有返回值就可以
        * */
        try {
            System.out.println(9/0);
//            return -1;  报异常时，这里不会执行
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.exit(0);//正常退出
            return 0;
        }finally {
            System.out.println("90");
            return -1;

        }

    }
    /*
    * 当做了处理时候    try  catch  一般后面的代码都会执行
    * 但是如果使用向上抛的话，出现异常  后面的不会运行
    * 如果还有未解决的异常  后面的代码任然不会执行
    *
    *
    * 向上抛可以在调用者层面处理  或者不处理让JVM处理。
    * */
    public static void main(String[] args) {
        System.out.println(tst());
    }
}
