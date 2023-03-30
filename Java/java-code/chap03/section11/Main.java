package chap03.section11;

// chap03/section11
public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println("1+2+3+...+100的和是" + sum);
    }
}
