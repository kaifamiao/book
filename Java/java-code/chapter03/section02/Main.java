package chapter03.section02;

// chapter03/section02/Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        int score = input.nextInt();
        if (score >= 60) {
            System.out.println("考试通过");
        } else {
            System.out.println("考试未通过");
        }
    }
}
