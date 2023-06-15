package chapter13.section04;

// chapter13/section04/AccountRunnable4.java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountRunnable4 implements Runnable {

    // 所有的TestAccount对象创建的线程共享同一个账户对象
    private Account account = new Account();
    private Lock lock = new ReentrantLock(); // 创建一个 ReentrantLock 对象

    public void makeWithdrawal(int amount) {
        lock.lock(); // 获取锁
        try {
            // 需要进行同步的代码
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + "准备取款");
                try {
                    Thread.sleep(500);//0.5秒后开始取款
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.withdraw(amount);
                System.out.println(Thread.currentThread().getName() + "完成取款");
            } else {
                System.out.println("余额不足，" + Thread.currentThread().getName() +
                        "的取款，余额为" + account.getBalance());
            }
        } finally {
            lock.unlock(); // 释放锁
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            makeWithdrawal(100); // 取款100元
        }
    }
}

