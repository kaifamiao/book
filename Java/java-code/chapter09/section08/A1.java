package chapter09.section08;

// chapter09/section08/A1.java
public interface A1{
    void show();
}

// 命名类B1
class B1 implements A1{
    public void show() {
        System.out.println("我是命名类B的show()方法");
    }
}

class Test {
    public static void main(String[] args) {
        A1 a1 =new B1();
        a1.show();
    }
}