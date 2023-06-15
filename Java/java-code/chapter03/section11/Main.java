package chapter03.section11;

// chapter03/section11/Main.java
public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1+2+3+...+100的和是" + sum);
    }
}
