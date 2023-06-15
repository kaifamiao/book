package chapter07.section10;

// chapter07/section10/StringTest.java
public class StringTest {

    public static void main(String[] args) {
        StringMain main = new StringMain();
        // 基本类型转换为String类型方法1，使用加号连接
        main.parseMethod1();
        // 基本类型转换为String类型方法2，使用String.valueOf()
        main.parseMethod2();
    }
}
