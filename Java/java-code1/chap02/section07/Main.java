package chap02.section07;

// chap02/section07
public class Main {

    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        System.out.println("逻辑与");
        boolean b1 = (x++ == 3) & (y++ == 4);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(b1);
        System.out.println("短路与");
        x = 4;
        y = 5;
        boolean b2 = (x++ == 3) && (y++ == 4);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(b2);
    }
}
