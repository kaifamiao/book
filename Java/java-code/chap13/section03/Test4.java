package chap13.section03;

// chap13/section03/Test4.java
import java.util.Date;

public class Test4 {
    public static void main(String[] args) {
        new Thread( new Runnable() {
            @Override
            public void run() {
                for(;;) {
                    System.out.println(new Date());
                    try {
                        Thread.sleep(1000);//线程睡眠1000毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
