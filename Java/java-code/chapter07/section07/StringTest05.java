package chapter07.section07;

// chapter07.section07/StringTest05.java
import java.util.Scanner;

public class StringTest05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = input.next();
        if (name.length() >= 6 && name.length() <= 20) {
            System.out.println("用户名长度合法");
        } else {
            System.out.println("用户名长度不合法");
        }
    }
}
