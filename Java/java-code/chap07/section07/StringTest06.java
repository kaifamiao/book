package chap07.section07;

// chap07/section07/StringTest06.java
import java.util.Scanner;

public class StringTest06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入Email");
        String email = input.next();
        email = email.toLowerCase();
        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".");
        // 必须包含“@”和“.”
        if (atIndex == -1 || dotIndex == -1) {
            System.out.println("Email非法，不存在@或.");
            return;
        }
        // “@”必须在“.”的前面
        if (atIndex > dotIndex) {
            System.out.println("Email非法，不允许@在.的后面");
            return;
        }
        // “@”不在开头和结尾，并且只能出现一次
        if (email.startsWith("@") == true || email.endsWith(".")) {
            System.out.println("Email非法，不能以@开头，不能以.结尾");
            return;
        }
        // “@”只能出现一次
        String array[] = email.split("@");
        if (array.length != 2) {
            System.out.println("Email非法，要求@有且只有一个");
            return;
        }
        System.out.println("Email合法");
    }
}
