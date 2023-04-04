package chap10.section02;

// chap10/section02/Main.java
public class Main {
    public static void main(String[] args) {
        try {
            int i = 1, j = 0, res;
            System.out.println("begin");
            res = i / j;
            System.out.println("end");
        } catch (Exception e) {
            System.out.println("caught");
            e.printStackTrace();
        }
        System.out.println("over");
    }
}
