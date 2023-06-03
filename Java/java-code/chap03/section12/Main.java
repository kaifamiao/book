package chap03.section12;

// chap03/section12/Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 输入数据并计算
        Scanner input =new Scanner(System.in);
        System.out.println("请输入学生的姓名");
        String name = input.next();
        int sum = 0;        // sum存储总分
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"门课的成绩");
            int score = input.nextInt();
            sum += score;
        }
        input.close();
        int avg = sum / 5;
        // 输出数据
        System.out.println("总分是" + sum);
        System.out.println("平均分是" + avg);
    }
}
