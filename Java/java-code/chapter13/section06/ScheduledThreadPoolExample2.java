package chapter13.section06;

// chapter13/section06/ScheduledThreadPoolExample2.java
// 周期执行
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class ScheduledThreadPoolExample2 {

    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        System.out.println("当前时间: " + LocalTime.now());
        // 两秒后开始执行任务，每隔 5 秒执行一次
        pool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("当前时间:" + LocalTime.now() +
                        ", 线程: " + Thread.currentThread().getName());
            }
        }, 2, 5, TimeUnit.SECONDS);
    }
}
