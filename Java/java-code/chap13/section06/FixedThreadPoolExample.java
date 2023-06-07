package chap13.section06;

// chap13/section06/FixedThreadPoolExample.java
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        System.out.println("当前时间: " + LocalTime.now());
        for (int i = 0; i < 10; i++) {
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
