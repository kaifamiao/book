package chapter11.section07;

// chapter11/section07/StreamTerminalExample.java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTerminalExample {

    public static void main(String[] args) {
        List numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 6);
        Stream stream = numbers.stream();
        // 使用 filter 方法过滤出偶数
        Stream filterStream = stream.filter(o -> (int) o % 2 == 0);
        // 使用 forEach 方法遍历输出
        filterStream.forEach(e -> System.out.println(e)); // 2 4 4 6
        filterStream = numbers.stream().filter(o -> (int) o % 2 == 0);
        // 使用 count 方法统计元素个数
        long count = filterStream.count();
        System.out.println(count); // 4
        // 使用 reduce 方法计算数值的和
        int sum = (int) numbers.stream().reduce(0, (a, b) -> (int) a + (int) b);
        System.out.println(sum); // 28
        // 使用 min 方法找到最小的数值
        int min = (int) numbers.stream().min((a, b) -> (int) a - (int) b).get();
        System.out.println(min); // 1
    }
}
