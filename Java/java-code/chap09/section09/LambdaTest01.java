package chap09.section09;

// chap09/section09/LambdaTest01.java
public interface LambdaTest01 {
    void show();
}

class Test {

    public static void main(String[] args) {
        LambdaTest01 a1 = () -> System.out.println("我是show()方法");
        LambdaTest01 a2 = () -> {
            System.out.println("我是show()方法");
            System.out.println("我是第二段代码");
        } ;
        a1.show();
        a2.show();
    }
}
