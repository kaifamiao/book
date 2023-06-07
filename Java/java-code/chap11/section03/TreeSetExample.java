package chap11.section03;

// chap11/section03/TreeSetExample.java
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // 创建一个TreeSet对象
        TreeSet treeSet = new TreeSet();

        // 添加元素到TreeSet
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(5);

        // 输出TreeSet中的元素，按照自然排序进行排序
        System.out.println("TreeSet: " + treeSet);

        // 删除元素
        treeSet.remove(3);
        System.out.println(treeSet);
        // 查找元素
        boolean contains = treeSet.contains(2);
        System.out.println("TreeSet contains element 2? " + contains);

        // 获取第一个和最后一个元素
        Object first = treeSet.first();
        Object last = treeSet.last();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
    }
}
