package easycoding.chapter07;

import java.util.concurrent.TimeUnit;

/**
 * @author: Kahen
 * @time: 2020/6/1 14:52
 * 证明ThreadLocal无法解决共享对象的更新问题
 */
public class InitValueInThreadLocal {
    private static final StringBuilder INIT_VALUE = new StringBuilder("init");
    // 覆写TreadLocal的initialValue，返回StringBuilder静态引用
    private static final ThreadLocal<StringBuilder> builder = new ThreadLocal<StringBuilder>() {
        @Override
        protected StringBuilder initialValue() {
            return INIT_VALUE;
        }
    };

    private static class AppendStringThead extends Thread {
        @Override
        public void run() {
            StringBuilder inThread = builder.get();
            for (int i = 0; i < 10; i++) {
                inThread.append("-" + i);
            }
            System.out.println(inThread.toString());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new AppendStringThead().start();

        }
        TimeUnit.SECONDS.sleep(10);
    }
}
