package chap09.section09;

// chap09/section09/LambdaTest02.java
public interface LambdaTest02 {
    void show(String s);
}

class Test02 {

    public static void main(String[] args) {
        LambdaTest02 a1 = (String s) -> System.out.println(s);
        LambdaTest02 a2 = (String s) -> {
            System.out.println(s);
            System.out.println("我是第二段代码");
        };
        a1.show("我是show()方法");
        a2.show("我是show()方法");
    }
}
