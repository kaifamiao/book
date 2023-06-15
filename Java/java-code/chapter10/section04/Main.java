package chapter10.section04;

// chapter10/section04/Main.java
public class Main {
    public static void main(String[] args) {
        try {
            int i = 1, j = 0, res;
            System.out.println("begin");
            res = i / j;
            System.out.println("end");
        } catch (ArithmeticException e) {
            System.out.println("caught");
            e.printStackTrace();
            System.exit(1);
        } finally {
            System.out.println("finally");
        }
        System.out.println("over");
    }
}
