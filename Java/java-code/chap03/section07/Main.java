package chap03.section07;

// chap03/section07
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = input.nextInt();
        switch (score / 10) {
            case 10, 9 -> System.out.println("A");
            case 8 -> System.out.println("B");
            case 7 -> System.out.println("C");
            case 6 -> System.out.println("D");
        }
    }
}
