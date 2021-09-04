package systematicLearn.Java.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/16 9:24<br/>
 *
 * @author lnh<br />
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        /*
         * (x < y) ? -1 : ((x == y) ? 0 : 1)
         * */
        set1.add("HashSet");
        set1.add("ArrayList");
        set1.add("TreeMap");
        set1.add("HashMap");
        set1.add("TreeSet");
        set1.add("LinkedList");
        for (String o : set1) {
            System.out.println(o);
        }
        System.out.println(">>>>>>>>>>>");
        Set<String> set2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                    int len1 = o1.length();
                    int len2 = o2.length();
                    int lim = Math.min(len1, len2);
                    char v1[] = o1.toCharArray();
                    char v2[] = o2.toCharArray();
                    int k = 0;
                    while (k < lim) {
                        char c1 = v1[k];
                        char c2 = v2[k];
                        if (c1 != c2) {
                            return c2 - c1;
                        }
                        k++;
                    }
                    return len2 - len1;
            }
        });
        set2.add("HashSet");
        set2.add("ArrayList");
        set2.add("TreeMap");
        set2.add("HashMap");
        set2.add("TreeSet");
        set2.add("LinkedList");
        for (String o : set2) {
            System.out.println(o);
        }


    }
}
