package systematicLearn.Java.lamda;

/**
 * @author lnh
 * @date 2021年07月01日 10:16
 */
public class ParamTest {
    public static int add(int a, int b,ca c){
        int res=a;
        for (int i = a+1; i <=b ; i++) {
            res=c.calu(res,i);
        }
        return  res;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 7, (x, y) -> x+y));
//        System.out.println(add(1, 3, new ca() {
//            @Override
//            public int calu(int res, int i) {
//                return 0;
//            }
//        }));
    }
}
interface  ca{
    int calu(int res,int i);
}