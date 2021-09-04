package systematicLearn.Java.Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * stream API
 * @author lnh
 * @date 2021年06月21日 11:45
 */

public class Test {
    public static void main(String[] args) {
        /*
        * 创建
        * 根据collection 创建stream  parallelStream
        *
        * */

        Collection<String> list= Arrays.asList("12","21","34");
        Stream<String> stream = list.stream();
        Stream<String> parallelStream= list.parallelStream();


        // 根据数组创建 stream、parallelStream
        int[] arr={1,23,34};
        IntStream stream1 = Arrays.stream(arr);





    }
}
