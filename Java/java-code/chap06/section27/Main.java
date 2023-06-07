package chap06.section27;

// chap06/section27/Main.java
import java.util.Comparator;
import java.util.Objects;
public class Main {

    public static void main(String[] args) {
        Object obj1 = null;
        Object obj2 = null;
        // 比较两个对象是否相等，可以避免空指针异常。
        System.out.println(Objects.equals(obj1, obj2));
        // 根据 "hello", "world", 123 生成一个哈希码
        System.out.println(Objects.hash("hello", "world", 123));
        Person person1 = new Person("Tom", 20);
        Person person2 = new Person("Jerry", 18);
        Comparator<Person> comparator = Comparator.comparing(person -> {
            return person.getAge();
        });
        // 使用指定的比较器比较两个对象
        System.out.println(Objects.compare(person1, person2, comparator));
        String str = null;
        // 检查一个对象是否为空，如果为空则抛出一个空指针异常，并且可以指定异常消息。
        Objects.requireNonNull(str, "str 不能为 null ");
    }
}
