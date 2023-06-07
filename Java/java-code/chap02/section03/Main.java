package chap02.section03;

// chap02/section03
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入：");
        String str = in.nextLine();
        System.out.println("你的输入用nextLine接收为：" + str);
        in.close();
    }
}
