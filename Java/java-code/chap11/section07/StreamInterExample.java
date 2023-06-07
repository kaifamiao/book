package chap11.section07;

// chap11/section07/StreamInterExample.java
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamInterExample {

    public static void main(String[] args) {
        List numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 6);
        Stream stream = numbers.stream();
        // 使用 filter 方法过滤出偶数
        Stream filterStream = stream.filter(new Predicate() {
            @Override
            public boolean test(Object o) {
                return (int) o % 2 == 0;
            }
        });
        //Stream filterStream = stream.filter(o -> (int) o % 2 == 0);
        stream = numbers.stream();
        // 使用 map 方法将每个数值翻倍
        Stream mapStream = stream.map(new Function() {
            @Override
            public Object apply(Object o) {
                return (int) o * 2;
            }
        });
        //Stream mapStream = stream.map(o -> (int) o * 2);
        stream = numbers.stream();
        // 使用 distinct 方法去除重复元素
        Stream distinctStream = stream.distinct();
        stream = numbers.stream();
        // 使用 sorted 方法对元素进行排序
        Stream sortedStream = stream.sorted();
        stream = numbers.stream();
        // 使用 limit 方法取出前5个元素
        Stream limitStream = stream.limit(5);
    }
}
