package chap03.section01;

// chap03/section01
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        int score = input.nextInt();
        if (score >= 60) {
            System.out.println("考试通过");
        }
    }
}
