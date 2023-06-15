package chapter13.section05;

// chapter13/section05/SharedData.java
// 共享资源类
public class SharedData {
    private char c;
    // 标志位，true表示商品未消费，false表示已消费
    private boolean isProduced = false;

    // 同步方法
    public synchronized void putShareChar(char c) {
        // 如果产品还未消费，则生产者等待
        if (isProduced) {
            try {
                System.out.println("消费者还未消费，因此生产者停止生产");
                wait(); //生产者等待
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.c = c;
        isProduced = true;// 标记已生产
        notify();// 通知消费者已经生产，可以消费
        System.out.println("生产者生产了产品" + c + "通知消费者消费......");
    }

    // 同步方法
    public synchronized char getShareChar() {
        // 如果产品还未生产，则消费者等待
        if (!isProduced) {
            try {
                System.out.println("生产者还未生产，因此消费者停止消费");
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        isProduced = false; // 标记已消费
        notify(); // 通知生产者已经消费，可以生产
        System.out.println("消费者消费了产品" + c + "，通知生产者生产");
        return this.c;
    }
}