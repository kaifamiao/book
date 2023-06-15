package chapter13.section02;

// chapter13/section02/ThreadExample.java
public class ThreadExample {

    // 启动main方法时，创建主线程
    public static void main(String[] args) {
        // 为主线程命名为"主线程"
        Thread.currentThread().setName("主线程");
        // 创建子线程对象t
        MyThread1 t = new MyThread1();
        // 设置子线程名称为"子线程"
        t.setName("子线程");
        // 启动子线程，调用start()方法后，子线程的run()方法开始运行；
        // 主线程的main()方法继续运行，形成了run()和main()并行的局面；
        t.start();
        // 子线程运行后，主线程继续运行
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() +
                    "运行到第" + i + "次");
        }
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()
                    + "运行到第" + i + "次");
        }
    }
}
