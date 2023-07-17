package chapter07.section11;

// chapter07/section11/StringBufferTest.java
public class StringBufferTest {

    public static void main(String[] args) {
        // 创建一个空的StringBuffer对象
        StringBuffer sb1 = new StringBuffer();
        // 创建一个初始容量为20的StringBuffer对象
        StringBuffer sb2 = new StringBuffer(20);
        // 创建一个包含字符串"Hello"的StringBuffer对象
        StringBuffer sb3 = new StringBuffer("Hello");
        // 创建一个包含StringBuilder对象内容的StringBuffer对象
        StringBuffer sb4 = new StringBuffer(new StringBuilder("World"));
    }
}
