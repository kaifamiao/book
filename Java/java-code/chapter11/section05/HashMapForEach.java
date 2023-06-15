package chapter11.section05;

// chapter11/section05/HashMapForEach.java
import java.util.HashMap;
import java.util.Map;

public class HashMapForEach {

    public static void main(String[] args) {
        // 创建好汉对象
        Hero hero1 = new Hero("林冲", "男");
        Hero hero2 = new Hero("鲁智深", "男");
        // 创建保存“键一值”对的集合对象
        Map heroes = new HashMap();
        // 把绰号与英雄对象按照“键一值”对的方式存储在 HashMap中
        heroes.put("豹子头", hero1);
        heroes.put("花和尚", hero2);
        // 输出英雄的绰号
        System.out.println("[英雄的绰号]");
        for (Object key : heroes.keySet()) {
            System.out.println(key.toString());
        }
        // 输出英雄的详细信息
        System.out.println("[英雄的详细信息]");
        for (Object value : heroes.values()) {
            Hero hero = (Hero) value;
            System.out.println(hero.getName() + " " + hero.getGender());
        }
    }
}
