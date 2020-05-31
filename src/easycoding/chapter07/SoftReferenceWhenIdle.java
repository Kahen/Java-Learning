package easycoding.chapter07;

import java.lang.ref.SoftReference;

/**
 * @author: Kahen
 * @time: 2020/5/31 20:30
 * 测试如果内存没有达到OOM，软引用持有的对象会被回收吗
 */
public class SoftReferenceWhenIdle {
    public static void main(String[] args) {
        House seller = new House("1号卖家房源");

        SoftReference<House> buyer2 = new SoftReference<House>(seller);
        seller = null;

        while (true) {
            // 下方两句代码仅以JVM进行垃圾回收
            System.gc();
            System.runFinalization();

            if (buyer2.get() == null) {
                System.out.println("house is null");
                break;
            } else {
                System.out.println("still there");
            }
        }
    }
}
