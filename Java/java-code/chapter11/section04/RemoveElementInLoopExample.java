package chapter11.section04;

// chapter11/section04/RemoveElementInLoopExample.java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class RemoveElementInLoopExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // 使用Iterator遍历集合并删除元素
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (element instanceof Integer i) {
                if (i % 2 == 0) {
                    iterator.remove(); // 安全地删除集合中的元素
                }
            }
        }
        System.out.println("List after removing even numbers: " + list);
    }
}
