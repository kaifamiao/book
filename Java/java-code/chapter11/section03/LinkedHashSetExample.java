package chapter11.section03;

// chapter11/section03/LinkedHashSetExample.java
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        // 创建LinkedHashSet对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        // 添加元素
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("cherry");
        linkedHashSet.add("date");
        // 打印集合中的元素
        System.out.println("LinkedHashSet: " + linkedHashSet);
        // 判断集合中是否包含指定元素
        System.out.println(linkedHashSet.contains("banana"));
        // 删除指定元素
        linkedHashSet.remove("cherry");
        // 打印集合中的元素个数
        System.out.println("Size: " + linkedHashSet.size());
        // 清空集合
        linkedHashSet.clear();
        // 打印集合是否为空
        System.out.println("Is empty: " + linkedHashSet.isEmpty());
    }
}
