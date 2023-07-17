package chapter13.section04;

// chapter13/section04/Resource.java
public class Resource {
    public synchronized void methodA(Resource resource) {
        System.out.println(Thread.currentThread().getName() +
                " acquired resource A and trying to access resource B");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resource.methodB(this);
    }

    public synchronized void methodB(Resource resource) {
        System.out.println(Thread.currentThread().getName() +
                " acquired resource B and trying to access resource A");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resource.methodA(this);
    }
}