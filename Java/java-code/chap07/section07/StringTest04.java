package chap07.section07;

// chap07.section07/StringTest04.java
public class StringTest04 {

    public static void main(String[] args) {
        String name1 = "kaifamiao";
        String name2 = "kaiFaMiao";
        boolean equalsIgnoreCase = name1.equalsIgnoreCase(name2);
        boolean equals = name1.equals(name2);
        System.out.println("两个字符串equalsIgnoreCase比较的结果是" + equalsIgnoreCase); // true
        System.out.println("两个字符串equals比较的结果是" + equals); // false
    }
}
