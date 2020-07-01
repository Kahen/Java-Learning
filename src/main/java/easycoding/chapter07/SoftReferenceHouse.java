package easycoding.chapter07;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Kahen
 * @time: 2020/5/31 19:42
 * 设置了JVM参数：-Xms20m -Xmx20m
 * 不断往示例代码中添加House对象，而每个House有2000个Door成员变量
 * 测试弱引用
 */
public class SoftReferenceHouse {
    public static void main(String[] args) {
        // List<House> houses = new ArrayList<House>();
        List<SoftReference> houses = new ArrayList<SoftReference>();

        //剧情反转注释处
        int i = 0;
        while (true) {
            // houses.add(new House());

            // 剧情反转注释处
            SoftReference<House> buyer2 = new SoftReference<>(new House("1号卖家房源"));
            // 剧情反转注释处
            houses.add(buyer2);

            System.out.println("i=" + (++i));
        }
    }
}

class House {
    private static final Integer DOOR_NUMBER = 2000;
    public Door[] doors = new Door[DOOR_NUMBER];

    public House(String s) {
        this.doors = doors;
    }


    class Door {
    }
}
