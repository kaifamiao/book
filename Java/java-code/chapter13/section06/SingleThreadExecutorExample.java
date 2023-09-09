package chapter13.section06;

// chapter13/section06/SingleThreadExecutorExample.java
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public class SingleThreadExecutorExample {

    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newSingleThreadScheduledExecutor();
        System.out.println("当前时间: " + LocalTime.now());
        for (int i = 0; i < 7; i++) {
            int number = i;
            pool.execute(new Runnable() {
                public void run() {
                    System.out.println("当前时间:" + LocalTime.now() + ", 线程: " +
                            Thread.currentThread().getName() + ", 序号：" + number);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
