package chap05.section07;

// chap05/section07/Main.java
public class Main {

    public static int factorial(int n) {
        if (n == 0 || n == 1) { // 递归结束的条件
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(5); // 调用递归函数计算 5 的阶乘
        System.out.println(result); // 输出 120
    }
}
