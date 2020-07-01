package easycoding.chapter06;

import java.util.HashMap;

/**
 * @author: Kahen
 * @time: 2020/5/27 20:24
 * 分析死链问题，将示例代码进行抽象。启动10万个线程
 */
public class HashMashEndlessLoop {
    private static HashMap<Long, EasyCoding> map = new HashMap<Long, EasyCoding>();

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            (new Thread() {
                @Override
                public void run() {
                    map.put(System.nanoTime(), new EasyCoding());
                    // System.out.println(map.toString()); 谨慎使用，CPU占满
                }
            }).start();
        }
    }
}
