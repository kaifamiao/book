package chap13.section04;

// chap13/section04/AccountRunnable3.java
public class AccountRunnable3 implements Runnable {

    // 所有的TestAccount对象创建的线程共享同一个账户对象
    private Account account = new Account();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            makeWithdrawal(100); // 取款100元
        }
    }

    private synchronized void makeWithdrawal(int amt) {
        // 同步代码块
        synchronized (account) {
            if (account.getBalance() >= amt) {
                System.out.println(Thread.currentThread().getName() +
                        "准备取款");
                try {
                    Thread.sleep(500);// 0.5秒后开始取款
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.withdraw(amt);
                System.out.println(Thread.currentThread().getName() +
                        "完成取款");
            } else {
                System.out.println("余额不足，" + Thread.currentThread().getName() +
                        "的取款，余额为" + account.getBalance());
            }
        }
    }
}
