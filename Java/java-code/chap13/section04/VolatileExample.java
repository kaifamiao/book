package chap13.section04;

//  chap13/section04/VolatileExample.java
public class VolatileExample {
    private volatile boolean flag = false;
    public void start() {
        // 启动一个新线程
        new Thread(() -> {
            System.out.println("新线程开始执行...");
            // 模拟耗时操作
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 修改 flag 的值为 true
            flag = true;
            System.out.println("新线程执行完毕，flag = " + flag);
        }).start();
    }
    public void watch() {
        // 检查 flag 的值
        while (!flag) {
            // 空循环等待 flag 的值变为 true
        }
        System.out.println("flag 的值已经变为 true");
    }
    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        example.start();
        example.watch();
    }
}

