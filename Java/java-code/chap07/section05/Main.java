package chap07.section05;

// chap07/section05/Main.java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\d\\d\\d");
        Matcher m = p.matcher("a123b");
        System.out.println(m.find()); // 输出结果true
    }
}
