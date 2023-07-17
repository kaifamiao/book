package chapter13.section06;

// chapter13/section06/ThreadPoolExecutorDemo.java
import java.util.concurrent.*;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        // 核心线程数为2，最大线程数为5，线程空闲时间为1秒，使用无界队列，
        // 使用默认的线程工厂和饱和策略
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,
                5, 1, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>());

        // 提交任务给线程池执行
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Executing task: " + taskId +
                        " by thread: " + Thread.currentThread().getName());
                try {
                    // 模拟任务执行时间
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // 关闭线程池
        executor.shutdown();
    }
}

