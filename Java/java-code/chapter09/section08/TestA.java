package chapter09.section08;

// chapter09/section08/TestA.java
public class TestA {
    public static void main(String[] args) {
        A a = new A();
        // 我是内部类
        a.call(new A.B());
    }
}
