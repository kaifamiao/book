package chap13.section05;

// chap13/section05/CommunicationThread.java
public class CommunicationThread implements Runnable {
    public static void main(String[] args) {
        CommunicationThread thread = new CommunicationThread();
        Thread ta = new Thread(thread, "线程ta");
        Thread tb = new Thread(thread, "线程tb");
        ta.start();
        tb.start();
    }
    @Override
    synchronized public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            if (i == 2) {
                try {
                    wait(); // 退出运行状态，放弃资源锁，进入等待队列
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (i == 1) {
                notify(); // 从等待序列中唤醒一个线程
            }
            if (i == 4) {
                notify(); // 从等待序列中唤醒一个线程
            }
        }
    }
}