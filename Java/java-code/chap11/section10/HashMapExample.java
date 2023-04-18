package chap11.section10;

// chap11/section10/HashMapExample.java
import chap11.section05.Hero;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {


    public static void main(String[] args) {
        // 创建好汉对象
        Hero hero1 = new Hero("林冲", "男");
        Hero hero2 = new Hero("鲁智深", "男");
        // 创建保存“键一值”对的集合对象
        Map<String,Hero> heroes = new HashMap<String,Hero>();
        // 把绰号与英雄对象按照“键一值”对的方式存储在 HashMap中
        heroes.put("豹子头", hero1);
        heroes.put("花和尚", hero2);
        // 输出英雄的绰号
        System.out.println("[英雄的绰号]");
        for (String key : heroes.keySet()) {
            System.out.println(key);
        }
        // 输出英雄的详细信息
        System.out.println("[英雄的详细信息]");
        for (Hero hero : heroes.values()) {
            System.out.println("姓名：" + hero.getName() +
                    "，性别：" + hero.getGender());
        }
    }
}
