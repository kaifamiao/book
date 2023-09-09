package chapter11.section04;

// chapter11/section04/IteratorExample.java
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("刘唐");
        list.add("吕方");
        list.add("白胜");
        list.add(2, "秦明");
        System.out.println("使用Iterator遍历，分别是：");
        Iterator it = list.iterator();// 获取集合迭代器Iterator
        while (it.hasNext()) {// 通过迭代器依次输出集合中所有的元素的信息
            String name = (String) it.next();
            System.out.println(name);
        }
    }
}
