package chapter10.section03;

// chapter10/section03/Main.java
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
        } finally {
            System.out.println("finally");
        }
        System.out.println("over");
    }
}
