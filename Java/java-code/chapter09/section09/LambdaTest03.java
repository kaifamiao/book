package chapter09.section09;

// chapter09/section09/LambdaTest03.java
public interface LambdaTest03 {
    void show(String str);
}

class Test03 {

    public static void main(String[] args) {
        LambdaTest03 a1 = str -> System.out.println(str);
        LambdaTest03 a2 = str -> {
            System.out.println(str);
            System.out.println("我是第二段代码");
        };
        a1.show("我是show()方法");
        a2.show("我是show()方法");
    }
}
