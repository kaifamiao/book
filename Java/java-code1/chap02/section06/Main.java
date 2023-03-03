package chap02.section06;

// chap02/section06
public class Main {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 7;
        // 逻辑与
        System.out.println("==逻辑与==");
        System.out.println((a > b) & (a > c));
        System.out.println((a > b) & (a < c));
        System.out.println((a < b) & (a < c));
        // 逻辑或
        System.out.println("==逻辑或==");
        System.out.println((a > b) | (a > c));
        System.out.println((a > b) | (a < c));
        System.out.println((a < b) | (a < c));
        // 逻辑异或
        System.out.println("==逻辑抑或==");
        System.out.println((a > b) ^ (a > c));
        System.out.println((a > b) ^ (a < c));
        System.out.println((a < b) ^ (a < c));
        // 短路与
        System.out.println("==短路与==");
        System.out.println((a > b) && (a > c));
        System.out.println((a > b) && (a < c));
        System.out.println((a < b) && (a < c));
        // 短路或
        System.out.println("==短路或==");
        System.out.println((a > b) || (a > c));
        System.out.println((a > b) || (a < c));
        System.out.println((a < b) || (a < c));

    }
}
