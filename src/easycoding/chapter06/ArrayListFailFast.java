package easycoding.chapter06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Kahen
 * @time: 2020/5/24 15:50
 * foreach遍历元素时，使用删除方式测试fail-fast机制
 */
public class ArrayListFailFast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        for (String s : list) {
            if ("two".equals(s)) {
                list.remove(s);
            }
        }
        System.out.println(list);
    }
}
