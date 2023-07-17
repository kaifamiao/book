package chapter13.section04;

// chapter13/section04/DeadlockTest.java
public class DeadlockTest {

    public static void main(String[] args) {
        Resource resourceA = new Resource();
        Resource resourceB = new Resource();

        Thread thread1 = new Thread(() -> {
            resourceA.methodA(resourceB);
        }, "Thread 1");

        Thread thread2 = new Thread(() -> {
            resourceB.methodB(resourceA);
        }, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
