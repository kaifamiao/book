package chap07.section07;

// chap07/section07/StringTest09.java
public class StringTest09 {

    public static void main(String[] args) {
        String str = String.format("见过,%s及%s", "晁天王", "众位头领");
        System.out.println(str);  // 见过,晁天王及众位头领
        str = String.format("字母a的大写是：%c", 'A');
        System.out.println(str);  // 字母a的大写是：A
        str = String.format("3 > 7的结果是：%b", 3 > 7);
        System.out.println(str);  // 3 > 7的结果是：false
        str = String.format("100的一半是：%d", 100 / 2);
        System.out.println(str); // 100的一半是：50
        // 使用printf()方法代替format方法来格式化字符串
        System.out.printf("50元的书打8.5折扣是：%f 元", 50 * 0.85); // 50元的书打8.5折扣是：42.500000 元
    }
}
