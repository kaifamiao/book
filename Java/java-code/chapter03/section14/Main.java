package chapter03.section14;

// chapter03/section14/Main.java
public class Main {

    public static void main(String[] args) {
        // 外循环4次，输出四行
        for (int i = 0; i <4; i++) {
            // 内循环输出每行前面的空格
            for (int j = 0; j < 4-i-1; j++) {
                System.out.print(" ");
            }
            // 内循环输出每行的*
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            // 一行结束，使用println()换行
            System.out.println();
        }
    }
}
