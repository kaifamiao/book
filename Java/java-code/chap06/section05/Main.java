package chap06.section05;

// chap07/section05/Main.java
public class Main {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("x before calling method: " + x);
        changeValue(x);
        System.out.println("x after calling method: " + x);
    }

    public static void changeValue(int num) {
        num = 20;
        System.out.println("num inside method: " + num);
    }
}
