package chap06.section29;

// chap06/section29/A.java
public class A {
//    public A(String color) {
//        System.out.println("from A");
//    }
}

class B extends A {
    public B() {
        System.out.println("from B");
    }
}

class TestA {

    public static void main(String[] args) {
        B b = new B();
    }
}
