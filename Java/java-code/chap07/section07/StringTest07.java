package chap07.section07;

// chap07/section07/StringTest07.java
public class StringTest07 {

    public static void main(String[] args) {
        String content = "这天气真TMD好";
        content = content.replace("TMD", "***");
        System.out.println(content); // 这天气真***好
    }
}
