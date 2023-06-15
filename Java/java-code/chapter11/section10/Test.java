package chapter11.section10;

// chapter11/section10/Test.java
public class Test{
    public static void main(String[] args) {
        Test t1 =new Test();
        t1.show("str");
        t1.show(10);
    }
    public <T> void show(T t){
        System.out.println(t.getClass().getName());
    }
}
