package chapter11.section05;

// chapter11/section05/ConcurrentHashMapExample.java
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // 创建一个 ConcurrentHashMap 对象
        ConcurrentHashMap map = new ConcurrentHashMap();
        // 向 ConcurrentHashMap 中插入键值对
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        // 获取键值对数量
        System.out.println("Size: " + map.size());
        // 获取键对应的值
        Object value = map.get("two");
        System.out.println("Value for key 'two': " + value);
        // 移除键值对
        map.remove("three");
        // 判断键是否存在
        boolean containsKey = map.containsKey("three");
        System.out.println("Contains key 'three': " + containsKey);
    }
}
