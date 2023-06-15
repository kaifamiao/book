package chapter09.section08;

// chapter09/section08/A.java
public class A {
    // 定义内部类
    static class B{
        void show() {
            System.out.println("我是内部类");
        }
    }
    void call(B b) {
        b.show();
    }

    public static void main(String[] args) {
        A a =new A();
        a.call(new B());
    }
}
