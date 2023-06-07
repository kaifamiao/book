package chap11.section09;

// chap11/section09/FillExample.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("小张");
        list.add("小王");
        list.add("小李");
        System.out.println("----替换前----");
        System.out.println(list);
        System.out.println("----替换后----");
        Collections.fill(list, "小杨"); // 替换元素
        System.out.println(list);
    }
}
