package chap13.section05;

// chap13/section05/CommunicationDemo.java
// 测试类
public class CommunicationDemo {
    public static void main(String[] args) {
        // 共享同一个资源
        SharedData s = new SharedData();
        // 消费者线程
        new Consumer(s).start();
        // 生产者线程
        new Producer(s).start();
    }
}