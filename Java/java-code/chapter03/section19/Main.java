package chapter03.section19;

// chapter03/section19/Main.java
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("循环结束");
    }
}
