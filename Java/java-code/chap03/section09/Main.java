package chap03.section09;

// chap03/section09/Main.java
public class Main {

    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1+2+3+...+100的和是" + sum);
    }
}
