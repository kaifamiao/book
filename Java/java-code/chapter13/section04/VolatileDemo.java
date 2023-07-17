package chapter13.section04;

import chapter13.section06.ScheduledThreadPoolExample1;

import java.util.concurrent.ScheduledThreadPoolExecutor;

// chapter13/section04/VolatileDemo.java
public class VolatileDemo {
    private static boolean flag = false;

    public static void main(String[] args) {
        // 线程1修改flag的值
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            flag = true;
            System.out.println("Thread 1: Modified flag to true");
        });

        // 线程2读取flag的值
        Thread thread2 = new Thread(() -> {
            while (!flag) {
                // 空循环等待flag的值被修改
            }

            System.out.println("Thread 2: Read flag as true");
        });

        // 启动线程
        thread1.start();
        thread2.start();
    }
}
