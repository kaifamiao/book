package chapter02.section02;

// chapter02/section02/Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入：");
        String str = in.next();
        System.out.println("你的输入用next接收为：" + str);
        in.close();
    }
}
