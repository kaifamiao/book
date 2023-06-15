package chapter06.section08;

// chapter06/section08/BankTester.java
public class BankTester {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.ownerName = "喵星人";
        myAccount.accountNumber = 1000234;
        myAccount.balance = 2000f;
        System.out.println("ownerName = " + myAccount.ownerName);
        System.out.println("accountNumber = " + myAccount.accountNumber);
        System.out.println("balance = " + myAccount.balance);
    }
}
