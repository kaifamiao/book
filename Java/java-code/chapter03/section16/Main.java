package chapter03.section16;

// chapter03/section16/Main.java
public class Main {

    public static void main(String[] args) {
        outer:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j + 1 < i) {
                    System.out.println();
                    break outer;
                }
                System.out.print(" i * j = " + (i * j) + " ");
            }
        }
        System.out.println();
    }
}
