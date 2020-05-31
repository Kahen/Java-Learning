package easycoding.chapter07;

import java.lang.ref.WeakReference;

/**
 * @author: Kahen
 * @time: 2020/5/31 20:39
 * 摒弃催出垃圾回收的代码，让弱引用自然的被YGC回收
 * JVM启动参数加：-XX:+PrintGCDetails
 */
public class WeakReferenceWhenIdle {
    public static void main(String[] args) {
        House seller = new House("1号卖家房源");
        WeakReference<House> buyer3 = new WeakReference<>(seller);
        seller = null;

        long start = System.nanoTime();
        int count = 0;
        while (true) {
            if (buyer3.get() == null) {
                long duration = (System.nanoTime() - start) / (1000 * 1000);
                System.out.println("house is null and exited time=" + duration + "ms");
                break;
            } else {
                System.out.println("still there. count=" + (count++));
            }
        }
    }
}
