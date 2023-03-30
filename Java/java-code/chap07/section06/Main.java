package chap07.section06;

// chap07/section06/Main.java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String regex = "\\d+"; // 匹配数字
        Pattern pattern = Pattern.compile(regex); // 将正则表达式编译成模式
        String text = "hello 123 world 456";
        Matcher matcher = pattern.matcher(text); // 创建匹配器对象
        String replacedText = matcher.replaceAll("###"); // 将匹配的子序列替换为"###"
        System.out.println(replacedText); // 输出替换后的结果字符串 hello ### world ###

    }
}
