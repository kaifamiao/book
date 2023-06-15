package chapter03.section13;

// chapter03/section13/Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int over = 0;
        Scanner input = new Scanner(System.in);
        // 外循环控制人数
        do {
            int sum = 0;
            System.out.print("请输入学生的姓名：");
            String name = input.next();
            // 内循环控制每个人的5门课
            for (int i = 0; i < 5; i++) {
                System.out.print("请输入第" + (i + 1) + "门课的成绩：");
                int score = input.nextInt();
                sum += score;
            }
            int avg = sum / 5;
            System.out.println("总分是：" + sum);
            System.out.println("平均分是：" + avg);
            System.out.println("继续输入吗？(1/0)");
            over = input.nextInt();
        } while (over == 1);
        System.out.println("程序已退出");
    }
}
