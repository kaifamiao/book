package chap09.section05;

// chap09/section05/USBInterface.java
public interface USBInterface {
    // 在接口中定义静态方法
    public static void descriptor() {
        System.out.println("这是USB3.0接口");
    }
}

class Test {
    public static void main(String[] args) {
        USBInterface.descriptor(); // 调用接口静态方法 --> 输出：这是USB3.0接口
    }
}
