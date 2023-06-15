package chapter02.section05;

// chapter02/section05/Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("请输入四位数字：");
        int number = in.nextInt();
        int thousand = number / 1000; // 分解获得千位数
        int hundred = number / 100 % 10; // 分解获得百位数
        int ten = number / 10 % 10; // 分解获得十位数
        int one = number % 10; // 分解获得个位数
        int sum = thousand + hundred + ten + one;
        System.out.println("千位数：" + thousand + "，百位数：" + hundred +
                "，十位数：" + ten + "，个位数：" + one);
        System.out.println("千位、百位、十位、个位之和为：" + sum);
    }
}
