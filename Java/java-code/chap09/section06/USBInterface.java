package chap09.section06;

// chap09/section05/USBInterface.java
public interface USBInterface {
    public abstract void service(); // 抽象方法不能是私有的

    public default void defaultMethod() {
        print("调用接口中的私有方法"); // 可以调用接口中的私有静态方法
    }

    public static void staticMethod() {
        println("调用接口的私有静态方法");  // public静态方法可以调用private静态方法
    }

    // 在接口中定义私有方法
    private static void println(String str) {
        System.out.println(str);
    }

    private void print(String str) {
        System.out.println(str);
    }
}

class Test {
    public static void main(String[] args) {
        // 调用接口静态方法
        USBInterface.staticMethod();   // 输出：调用接口的私有静态方法
    }
}