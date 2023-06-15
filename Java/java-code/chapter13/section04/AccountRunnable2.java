package chapter13.section04;

// chapter13/section04/AccountRunnable2.java
public class AccountRunnable2 implements Runnable {

    // 所有的TestAccount对象创建的线程共享同一个账户对象
    private Account account = new Account();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            makeWithdrawal(100); // 取款100元
        }
    }

    private synchronized void makeWithdrawal(int amount) {
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
    }
}
