package chap13.section02;

// chap13/section02/RunnableExample.java
public class RunnableExample {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        // 创建子线程对象t
        Thread t = new Thread(new MyThread2());
        // 设置子线程名称为"子线程"
        t.setName("子线程");
        // 启动子线程，调用run方法，子线程开始运行
        t.start();
        // 子线程运行后，主线程继续运行
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() +
                    "运行到第" + i + "次");
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() +
                    "运行到第" + i + "次");
        }
    }
}
