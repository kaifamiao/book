package chap13.section05;

// chap13/section05/BlockingQueueExample.java
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    queue.put("Task " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                while (true) {
                    String task = queue.take();
                    System.out.println("Processing " + task);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
