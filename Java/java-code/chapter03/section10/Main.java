package chapter03.section10;

// chapter03/section10/Main.java
public class Main {

    public static void main(String[] args) {
        int i = 1, sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("1+2+3+...+100的和是" + sum);
    }
}
