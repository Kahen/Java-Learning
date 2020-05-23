package easycoding.chapter06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Kahen
 * @time: 2020/5/21 16:36
 * 分别为入参组容量不够时、入参数容量刚好时，以及入参数组容量超过集合大小时，并记录其执行时间
 */
public class ToArraySpeedTest {
    private static final int COUNT = 100 * 100 * 100;

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(COUNT);
        // 构造一个100万个元素的测试集合
        for (int i = 0; i < COUNT; i++) {
            list.add(i * 1.0);

        }
        long start = System.nanoTime();

        Double[] notEnoughArray = new Double[COUNT - 1];
        list.toArray(notEnoughArray);

        long middle1 = System.nanoTime();

        Double[] equalArrays = new Double[COUNT];
        list.toArray(equalArrays);

        long middle2 = System.nanoTime();

        Double[] doubleArray = new Double[COUNT * 2];
        list.toArray(doubleArray);
        long end = System.nanoTime();

        long notEnoughArrayTime = middle1 - start;
        long equalArrayTime = middle2 - middle1;
        long doubleArrayTime = end - middle2;
        
        System.out.println("数组容量大小小于集合大小：notEnoughArrayTime:" + notEnoughArrayTime / (1000.0 * 1000.0) + " ms");
        System.out.println("数组容量大小等于集合大小：equalArrayTime:" + equalArrayTime / (1000.0 * 1000.0) + " ms");
        System.out.println("数组容量大小两倍集合大小：doubleArrayTime:" + doubleArrayTime / (1000.0 * 1000.0) + " ms");
    }
}
