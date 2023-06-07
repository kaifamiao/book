package chap11.section07;

// chap11/section07/StreamExample.java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        // 创建List集合
        List numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 使用 创建Stream流对象
        Stream stream = numbers.stream();
    }
}
