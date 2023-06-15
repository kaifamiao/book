package chapter07.section08;

// chapter07/section08/IntegerTest02.java
public class IntegerTest02 {

    public static void main(String[] args) {
        // 通过访问包装类的常量，来获取最大值和最小值
        System.out.println("int的最大值：" + Integer.MAX_VALUE);   // 2147483647
        System.out.println("int的最小值：" + Integer.MIN_VALUE);   // -2147483648
        System.out.println("byte的最大值：" + Byte.MAX_VALUE);     // 127
        System.out.println("byte的最小值：" + Byte.MIN_VALUE);     // -128
        System.out.println("double的最大值：" + Double.MAX_VALUE); // 1.7976931348623157E308
        System.out.println("double的最小值：" + Double.MIN_VALUE); // 4.9E-324
    }
}
