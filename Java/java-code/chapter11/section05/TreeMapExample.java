package chapter11.section05;

// chapter11/section05/TreeMapExample.java
import java.util.Properties;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // 创建TreeMap对象
        TreeMap treeMap = new TreeMap();
        // 添加键值对
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");
        // 输出TreeMap
        System.out.println("TreeMap: " + treeMap);
        // 获取键值对
        System.out.println("Value of key 3: " + treeMap.get(3));
        // 删除键值对
        treeMap.remove(2);
        // 判断是否包含指定的键或值
        System.out.println("Contains key 2: " + treeMap.containsKey(2));
        System.out.println("Contains value 'Four': "
                + treeMap.containsValue("Four"));
        // 输出TreeMap的键和值
        System.out.println("Keys: " + treeMap.keySet());
        System.out.println("Values: " + treeMap.values());
        // 遍历TreeMap的键值对
        for (Object key : treeMap.keySet()) {
            System.out.println("Key: " + key +
                    ", Value: " + treeMap.get(key));
        }
        // 获取第一个和最后一个键
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());
        // 获取小于等于指定键的最大键和大于等于指定键的最小键
        System.out.println("Floor key of 3: " + treeMap.floorKey(3));
        System.out.println("Ceiling key of 3: " + treeMap.ceilingKey(3));
    }
}
