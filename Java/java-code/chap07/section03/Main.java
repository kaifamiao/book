package chap07.section03;

// chap07/section03/Main.java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String regex = "\\d+";  // 匹配数字
        Pattern pattern = Pattern.compile(regex);  // 将正则表达式编译成模式
        String text = "hello 123 world";
        Matcher matcher = pattern.matcher(text);  // 创建匹配器对象
        while (matcher.find()) {
            System.out.println(text + "匹配结果是：" + matcher.group());  // 输出匹配结果

        }
    }
}
