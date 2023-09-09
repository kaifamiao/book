package chapter10.section06;

// chapter10/section06/Main.java
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            divide();
        } catch (InputMismatchException e) {
            System.out.println("除数和被除数必须都是整数");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为零");
        } catch (Exception e) {
            System.out.println("其他异常" + e.getMessage());
        } finally {
            System.out.println("感谢使用本程序");
        }
        System.out.println("程序结束");
    }

    // 通过throws声明抛出设计时异常
    public static void divide() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("计算开始");
        int i, j, res;
        System.out.println("请输入被除数");
        i = input.nextInt();
        System.out.println("请输入除数");
        j = input.nextInt();
        res = i / j;
        System.out.println(i + "/" + j + "=" + res);
        System.out.println("计算结束");
    }
}
