package chapter11.section01;

// chapter11/section01/ArrayListExample.java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 创建ArrayList集合对象list
        System.out.println("----创建ArrayList集合----");
        ArrayList list = new ArrayList();
        // 向ArrayList集合中添加数据
        // add()方法将添加到集合中的数据被转换为Object类型。
        System.out.println("----向ArrayList集合中添加3个元素----");
        list.add("黄信");
        list.add("秦明");
        list.add("华荣");
        // for循环遍历集合中的元素
        System.out.println("----for循环遍历集合----");
        for (int i = 0; i < list.size(); i++) {
            // 从集合中获取的数据是Object类型，因此需要类型转换。
            String name = (String) list.get(i);
            System.out.println(name);
        }
        // 判断集合中是否包含"王英"
        System.out.println("----判断集合中是否包含\"王英\"----");
        System.out.println("王英" + list.contains("王英"));
        // 把索引为0的元素移除
        System.out.println("----把索引为0的元素移除----");
        list.remove(0);
        // 把索引为1的元素替换为"宋江"
        System.out.println("----把索引为1的元素替换为\"宋江\"----");
        list.set(1, "宋江");
        // 使用增强for循环遍历集合
        System.out.println("----增强for循环遍历集合----");
        for (Object obj : list) {
            // 从集合中获取的数据是Object类型，因此需要类型转换。
            String name = (String) obj;
            System.out.println(name);
        }
        // 输出"周通"元素所在的索引位置
        System.out.println("----周通在集合中的索引----");
        System.out.println("周通在集合中的索引是" + list.indexOf("周通"));
        // 清空集合中的数据
        System.out.println("----清空集合中的元素----");
        list.clear();
        // 判断集合中是否有元素
        System.out.println("----判断集合中是否有元素----");
        System.out.println(list.isEmpty());
    }
}
