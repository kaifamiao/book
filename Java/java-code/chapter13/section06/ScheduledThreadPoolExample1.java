package chapter13.section06;

// chapter13/section06/ScheduledThreadPoolExample1.java
// 定时执行（延时）
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class ScheduledThreadPoolExample1 {

    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        System.out.println("当前时间: " + LocalTime.now());
        for (int i = 0; i < 3; i++) {
            int number = i;
            pool.schedule(new Runnable() {
                public void run() {
                    System.out.println("当前时间:" + LocalTime.now() + ", 线程: " +
                            Thread.currentThread().getName() + ", 序号：" + number);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, 5, TimeUnit.SECONDS);
        }
    }
}
