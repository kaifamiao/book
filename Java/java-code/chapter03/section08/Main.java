package chapter03.section08;

// chapter03/section08/Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = input.nextInt();
        String level = switch (score / 10) {
            case 10, 9 -> {
                String result = "A,你是非常棒的";
                yield  result;
            }
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "E";
        };
        System.out.println("你的成绩等级为：" + level);
    }
}
