package threadPool;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author: Kahen
 * @time: 2020/7/1 22:16
 * 这是一个简单的Runnable类，需要大约5秒来执行来任务
 */
public class MyRunnable implements Runnable {
    private String command;

    public MyRunnable(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Start.Time=" + new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName() + "End.Time=" + new Date());
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "MyRunnable{" +
                "command='" + command + '\'' +
                '}';
    }
}
