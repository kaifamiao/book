package chapter13.section03;

// chapter13/section03/WatchingThread.java
import java.io.File;

public class WatchingThread extends Thread {
    File file = new File("C:");
    public void run() {
        while (true) {
            long free = file.getFreeSpace();
            System.out.println("C盘剩余空间 = " + free / 1024 / 1024 / 1024 + "G");
            if (free < 1024 * 1024 * 1024) {
                System.err.println("C盘剩余空间不足1G");
            }
            try {
                // 暂停5秒后继续监视
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        WatchingThread thread = new WatchingThread();
        // thread被设置为守护线程，守护线程的运行不影响进程的终止，
        // 必须于start()之前设置
        thread.setDaemon(true);
        thread.start();
    }
}
