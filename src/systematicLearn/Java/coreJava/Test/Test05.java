package systematicLearn.Java.coreJava.Test;
/**
 * 一些声明信息
 * Description:
 * date: 2021/6/3 14:14
 * @author lnh
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int[] arr11={};
        int[] arr2=new int[]{};

        String[]  s=new String[]{"hello","word","!"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (String string:s) {
            System.out.println(string);
        }


         Result result = maxAvg(new int[]{12, 1231,14, 123, 454});
        System.out.println(result.max);
        System.out.println(result.avg);



        int[] arr1 = {1, 2, 3};
        for (int i : arr1) {
            i = 4;
        }
        System.out.println(arr1[0]);

    }

    public static class Result{
        int max;
        double avg;
    }
    public  static Result maxAvg(int[] arr){
        Result result=new Result();
        int sum = 0;
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            max=(max<arr[i] ? arr[i]:max);
        }
        result.avg=sum/arr.length;
        result.max=max;
        return  result;
    }
}
