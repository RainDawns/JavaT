package systematicLearn.Java.homework.Day14;

/**
 * @author lnh
 * @date 2021年06月19日 16:16
 */
public class Test01 {
    public static void show(Color color){
        switch (color){
            case RED:
                System.out.println("红灯停");
                break;
            case GREEN:
                System.out.println("绿灯行");
                break;
            case YELLOW:
                System.out.println("黄灯等一等");
                break;
        }
    }
    public static void main(String[] args) {
        show(Color.RED);
        show(Color.GREEN);
        show(Color.YELLOW);
    }
}
enum Color{
    RED,GREEN,YELLOW;
}