package chap03.section13;

// chap03/section13
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String over = null;
        Scanner input = new Scanner(System.in);
        //外循环控制人数
        do {
            int sum = 0;
            System.out.print("请输入学生的姓名：");
            String name = input.next();
            //内循环控制每个人的5门课
            for (int i = 0; i < 5; i++) {
                System.out.print("请输入第" + (i + 1) + "门课的成绩：");
                int score = input.nextInt();
                sum += score;
            }
            int avg = sum / 5;
            System.out.println("总分是：" + sum);
            System.out.println("平均分是：" + avg);
            System.out.println("继续输入吗？(y/n)");
            over = input.next();
        } while ("y".equals(over) || "Y".equals(over));
        System.out.println("程序已退出");
    }
}
