package chap13.section02;

// chap13/section02/CallableExample.java
import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) throws InterruptedException {
        // 创建 Callable 对象
        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            return sum;
        };

        // 创建线程并启动
        Thread thread = new Thread(() -> {
            try {
                // 执行 Callable 对象并获取结果
                int result = task.call();
                System.out.println("计算结果：" + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.start();
        // 让主线程等待异步线程执行完毕
        thread.join();
        // 继续执行主线程的其他逻辑
        System.out.println("主线程继续执行");
    }
}
