package chapter11.section05;

// chapter11/section05/LinkedHashMapExample.java
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // 创建一个 LinkedHashMap 对象
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();
        // 添加键值对到 LinkedHashMap
        linkedHashMap.put("one", 1);
        linkedHashMap.put("two", 2);
        linkedHashMap.put("three", 3);
        linkedHashMap.put("four", 4);
        // 遍历 LinkedHashMap，输出键值对的插入顺序
        for (Object o : linkedHashMap.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println("Key: " + entry.getKey()
                    + ", Value: " + entry.getValue());
        }
        // 按照访问顺序访问元素，最近访问的元素会被移到链表末尾
        System.out.println("Value of 'one': " +
                linkedHashMap.get("one"));
        System.out.println("Value of 'two': " +
                linkedHashMap.get("two"));
        // 输出按照访问顺序排序后的 LinkedHashMap
        System.out.println(linkedHashMap);
    }
}
