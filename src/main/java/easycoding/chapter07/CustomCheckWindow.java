package easycoding.chapter07;

import java.util.concurrent.Semaphore;

/**
 * @author: Kahen
 * @time: 2020/5/29 20:56
 * 基于执行时间的同步类
 */
public class CustomCheckWindow {
    public static void main(String[] args) {

    }

    private static class SecurityCheckThread extends Thread {
        private int seq;
        private Semaphore semaphore;

        public SecurityCheckThread(int seq, Semaphore semaphore) {
            this.seq = seq;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("No." + seq + "乘客，正在查验中");

                // 假设号码是整除2的人是身份可疑人员，需要花更长的时间来安检
                if (seq % 2 == 0) {
                    Thread.sleep(1000);
                    System.out.println("No." + seq + "乘客，身份可疑，不能出国！");

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
                System.out.println("No." + seq + "乘客已完成服务");
            }
        }
    }
}
