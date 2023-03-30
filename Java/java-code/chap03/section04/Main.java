package chap03.section04;

// chap03/section04
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("是闰年");
                } else {
                    System.out.println("不是闰年");
                }
            } else {
                System.out.println("是闰年");
            }
        } else {
            System.out.println("不是闰年");
        }
    }
}
