package easycoding.chapter06;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: Kahen
 * @time: 2020/5/23 16:35
 */
public class ListEquals {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);

        if (arrayList.equals(linkedList)) {
            System.out.println("equals is true");
        } else {
            System.out.println("equals is false");
        }
    }
}
