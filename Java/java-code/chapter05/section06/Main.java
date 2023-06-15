package chapter05.section06;

// chapter05/section06/Main.java
public class Main {

    public static int sum(int... nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        int result1 = sum(1, 2, 3);
        System.out.println(result1); // 输出 6

        int result2 = sum(1, 2, 3, 4, 5);
        System.out.println(result2); // 输出 15

    }
}
