package base.chapter12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-04-09 11:40
 */
public class HashMapAndHashTable {

    public static void sort(Comparable[] a) {
        //将a[]按升序排列
        int N = a.length;
        for (int i = 1; i < N; i++) {
            //将a[i]插入到a[i-1]，a[i-2]，a[i-3]……之中
            for (int j = i; j > 0 && a[j].compareTo(a[j - 1]) < 0; j--) {
                Comparable temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                System.out.println(Arrays.toString(a)+"此时i="+i+" j="+j);
            }
        }
    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();
        Hashtable hashtable = new Hashtable();
        sort(new Comparable[]{1, 8, 3, 9, 6, 4, 10});
    }
}
