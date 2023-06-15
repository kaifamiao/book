package chapter13.section03;

// chapterter13/section03/Test5.java
public class Test5 {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread t2 =new SecondThread();
        t1.start();
        t2.start();
    }
}

class FirstThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("第一个线程的第"+ (i+1 )+"次运行");
            Thread.yield();//暂停线程
        }
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("第二个线程的第"+ (i+1 )+"次运行");
            Thread.yield();//暂停线程
        }
    }
}

