package chapter11.section05;

// chapter11/section05/HashtableExample.java
import java.util.Hashtable;
public class HashtableExample {
    public static void main(String[] args) {
        // 创建 Hashtable 对象
        Hashtable hashtable = new Hashtable();
        // 添加键值对
        hashtable.put("one", 1);
        hashtable.put("two", 2);
        hashtable.put("three", 3);
        hashtable.put("four", 4);
        // 获取键值对
        System.out.println("Value of key 'one': " + hashtable.get("one"));
        // 判断是否包含指定的键或值
        System.out.println("Contains key 'two': "
                + hashtable.containsKey("two"));
        System.out.println("Contains value 5: "
                + hashtable.containsValue(5));
        // 删除键值对
        hashtable.remove("three");
        // 输出 Hashtable 的键和值
        System.out.println("Keys: " + hashtable.keySet());
        System.out.println("Values: " + hashtable.values());
        // 遍历 Hashtable 的键值对
        for (Object key : hashtable.keySet()) {
            System.out.println("Key: " + key +
                    ", Value: " + hashtable.get(key));
        }
        // 获取 Hashtable 的大小
        System.out.println("Size of hashtable: " + hashtable.size());
    }
}
