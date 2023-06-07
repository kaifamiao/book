package chap13.section03;

// chap13/section03/MyThread2.java
public class MyThread2 extends Thread {
    public String firstName;
    public String lastName;
    @Override
    public void run() {
        firstName = "喵星人";
        lastName="小王";
    }
}
class Test2 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();
        System.out.println("firstName:"+t.firstName);
        System.out.println("lastName:"+t.lastName);
    }
}

// chap13/section03/Test3.java
class Test3 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();
        try {
            t.join(); // t的run方法运行结束后，在运行主线程的main方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("firstName:"+t.firstName);
        System.out.println("lastName:"+t.lastName);
    }
}
