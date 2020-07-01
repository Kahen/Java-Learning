package easycoding.chapter07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Kahen
 * @time: 2020/6/1 15:11
 * 模拟脏数据的场景，线程池中的线程可能会读取到上一个线程缓存的用户信息
 */
public class DirtyDataInThreadLocal {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        // 使用固定大小为1的线程池，说明上一个的线程属性会被下一个线程属性复用
        ExecutorService pool = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 2; i++) {
            MyThread thread = new MyThread();
            pool.execute(thread);
        }
    }

    private static class MyThread extends Thread {
        private static boolean flag = true;

        @Override
        public void run() {
            if (flag) {
                // 第一个线程set后，并没有进行remove
                // 而第二个线程由于某种原因没有进行set操作
                threadLocal.set(this.getName() + ".session info.");
                flag = false;
            }
            System.out.println(this.getName() + " 线程是 " + threadLocal.get());
        }
    }
}

