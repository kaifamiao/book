package chap13.section02;

// chap13/section02/CallableExample.java
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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
        // 创建一个 ExecutorService
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // 提交任务并获取 Future 对象
        Future<Integer> future = executorService.submit(task);

        // 在主线程中进行其他操作
        try {
            // 等待计算完成并获取结果
            Integer result = future.get();

            // 输出计算结果
            System.out.println("计算结果: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 关闭 ExecutorService
        executorService.shutdown();
        System.out.println("主线程继续执行");
    }
}
