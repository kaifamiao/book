package chap03.section16;

// chap03/section16
public class Main {

    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j + 1 < i) {
                    System.out.println();
                    break outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
