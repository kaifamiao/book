package chap03.section15;

// chap03/section15/Main.java
public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (true) {
            sum += i;
            if (sum > 100) {
                break;
            }
            i++;
        }
        System.out.println("1+2+3+...加到第" + i + "个数时，和超过了100");
    }
}
