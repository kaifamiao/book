package chap13.section03;

// chap13/section03/MyThread.java
public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +
                    "运行到第" + i + "次");
        }
    }
}
class Test {
    // 启动main方法时，创建主线程
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) { // 主线程运行5次后，开始MyThread3线程
                MyThread t = new MyThread("MyThread");
                try {
                    t.start();
                    t.join();// 通过join方法将该线程插入到主线程前面
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() +
                    "运行到第" + i + "次");
        }
    }
}
