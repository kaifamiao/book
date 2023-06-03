package chap07.section06;

// chap07/section06/Main.java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // 匹配数字
        String regex = "\\d+";
        // 将正则表达式编译成模式
        Pattern pattern = Pattern.compile(regex);
        String text = "hello 123 world 456";
        // 创建匹配器对象
        Matcher matcher = pattern.matcher(text);
        // 将匹配的子序列替换为"###"
        String replacedText = matcher.replaceAll("###");
        // 输出替换后的结果字符串 hello ### world ###
        System.out.println(replacedText);
    }
}
