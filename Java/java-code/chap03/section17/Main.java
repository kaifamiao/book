package chap03.section17;

// chap03/section17
public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("1+2+3+...+100去除7的倍数的和是" + sum);
    }
}
