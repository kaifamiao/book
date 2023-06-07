package chap13.section04;

// chap13/section04/Account.java
// 银行账户类
public class Account {
    private int balance = 500; // 余额 500 元
    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {  // 取款操作
        balance = balance - amount;
    }
}
