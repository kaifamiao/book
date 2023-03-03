package chap02.section04;

// chap02/section04
import java.util.Scanner;

public class ScoreManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = input.next();
        System.out.println("请输入java成绩");
        int javaScore = input.nextInt();
        System.out.println("请输入python成绩");
        int pythonScore = input.nextInt();
        input.close();

        // 输出成绩
        System.out.println("学生姓名是：" + name);
        System.out.println("学生java成绩是：" + javaScore);
        System.out.println("学生python成绩是：" + pythonScore);

    }
}
