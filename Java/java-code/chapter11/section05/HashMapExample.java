package chapter11.section05;

// chapter11/section05/HashMapExample.java
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // 创建好汉对象
        Hero hero1 = new Hero("林冲", "男");
        Hero hero2 = new Hero("鲁智深", "男");
        // 创建保存"键一值"对的集合对象
        Map heroes = new HashMap();
        // 把绰号与英雄对象按照"键一值"对的方式存储在HashMap中
        heroes.put("豹子头", hero1);
        heroes.put("花和尚", hero2);
        // 输出英雄的个数
        System.out.println("已添加" + heroes.size() + "个英雄");
        // 输出键集
        System.out.println("键集" + heroes.keySet());
        // 判断"豹子头"是否在键集中
        String key = "豹子头";
        if (heroes.containsKey(key)) {
            Hero hero = (Hero) heroes.get(key);
            System.out.println("绰号" + key + "的英雄是" + hero.getName());
        }
        // 判断"花和尚"是否在键集中，如果存在，则删除此键值对
        key = "花和尚";
        if (heroes.containsKey(key)) {
            heroes.remove(key);
            System.out.println("英雄" + key + "的信息已经被删除");
        }
    }
}
