package easycoding.chapter06;

import java.util.HashMap;

/**
 * @author: Kahen
 * @time: 2020/5/27 20:12
 * 观察一下resize()方法是如何进行数据迁移的
 */
public class HashMapSimpleResize {
    private static HashMap map = new HashMap();

    public static void main(String[] args) {
        // 扩容的阈值时table.length*0.75
        // 第一次扩容发生在第13个元素置入时
        for (int i = 0; i < 13; i++) {
            map.put(new UserKey(), new EasyCoding());

        }
    }
}

class UserKey {
    // 目的是让所有的Entry都在一个哈希桶内
    @Override
    public int hashCode() {
        return 1;
    }

    // 保证e.hash == hash && ((k = e.key) ==key || key.equals(k) 为false
    // 如果为true，则会对同一个Key上的值进行覆盖，不会形成链表
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}