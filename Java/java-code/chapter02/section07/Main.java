package chapter02.section07;

// chapter02/section07/Main.java
public class Main {

    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        System.out.println("逻辑与");
        boolean b1 = (x++ == 3) & (y++ == 4);
        System.out.println("x = " + x); // x = 5
        System.out.println("y = " + y); // y = 6
        System.out.println(b1);         // false
        System.out.println("短路与");
        x = 4;
        y = 5;
        boolean b2 = (x++ == 3) && (y++ == 4);
        System.out.println("x = " + x); // x = 5
        System.out.println("y = " + y); // y = 5
        System.out.println(b2);         // false
    }
}
