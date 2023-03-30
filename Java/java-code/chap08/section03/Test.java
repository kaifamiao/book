package chap08.section03;

// chap08/section03/Test.java
public class Test {

    public static void main(String[] args) {
        Child c = new Child("Jerry", 10, "Primary School");
        c.printInfo(); // 调用重写父类的方法
    }
}
