package systematicLearn.Java.homework.Day16;

/**
 * @author lnh
 * @date 2021年06月21日 19:04
 */
public class DivisionByZero {
    /*public static void  division(){
        try {
            int i=10/0;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        division();
    }*/
    public static void division()throws Exception{
        int i=10/0;
    }
    public static void main(String[] args) {

        try {
            division();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
