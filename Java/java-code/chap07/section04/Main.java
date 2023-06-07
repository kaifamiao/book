package chap07.section04;

// chap07/section04/Main.java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String regex = "\\d+"; // 匹配数字
        Pattern pattern = Pattern.compile(regex); // 将正则表达式编译成模式
        String text = "123456";
        Matcher matcher = pattern.matcher(text); // 创建匹配器对象
        boolean isMatched = matcher.matches(); // 尝试将整个输入序列与该模式匹配
        System.out.println(isMatched); // 输出匹配结果，true
    }
}
