package chapter13.section05;

// chapter13/section05/Consumer.java
// 消费者线程类
public class Consumer extends Thread {
    private SharedData s;

    public Consumer(SharedData s) {
        this.s = s;
    }

    @Override
    public void run() {
        char ch;
        do {
            try {
                Thread.sleep((int) (Math.random() * 3000));
            } catch (Exception e) {
                e.printStackTrace();
            }
            ch = s.getShareChar(); // 从仓库中取出商品
        } while (ch != 'D');
    }
}