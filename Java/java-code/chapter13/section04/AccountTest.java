package chapter13.section04;

// chapter13/section04/AccountTest.java
// 测试类
public class AccountTest {
    public static void main(String[] args) {
        // 创建两个线程
        AccountRunnable thread = new AccountRunnable();
        Thread one = new Thread(thread);
        Thread two = new Thread(thread);
        one.setName("小王");
        two.setName("小王嫂");
        // 启动线程
        one.start();
        two.start();
    }
}
