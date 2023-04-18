package chap11.section07;

// chap11/section07/StreamErrorExample.java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamErrorExample {

    public static void main(String[] args) {
        List numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 6);
        Stream stream = numbers.stream();
        // 使用 filter 方法过滤出偶数
        Stream filterStream = stream.filter(o -> (int) o % 2 == 0);
        // 使用 map 方法将每个数值翻倍 会抛出异常 IllegalStateException
        Stream mapStream = stream.map(o -> (int) o * 2);
    }
}
