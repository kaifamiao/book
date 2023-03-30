package chap07.section11;

// chap07/section11/Main.java
public class Main {

    public static void main(String[] args) {
        // 创建一个空的StringBuffer对象
        StringBuffer sb = new StringBuffer();
        sb.append("Hello"); // 添加字符串
        sb.insert(5, " World"); // 在指定位置插入字符
        sb.deleteCharAt(10); // 删除字符
        sb.reverse();  // 反转字符序列
        // 输出结果
        System.out.println(sb.toString()); // 输出 "dlroW olleH"
    }
}
