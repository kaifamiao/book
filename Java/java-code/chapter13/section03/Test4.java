package chapter13.section03;

// chapter13/section03/Test4.java
import java.time.LocalTime;
public class Test4 {
    public static void main(String[] args) {
        new Thread( new Runnable() {
            @Override
            public void run() {
                for(;;) {
                    System.out.println(LocalTime.now() +
                            " 让编程变简单，让学习变快乐！");
                    try {
                        Thread.sleep(1000); // 线程睡眠1000毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
