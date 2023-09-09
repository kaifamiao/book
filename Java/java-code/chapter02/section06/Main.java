package chapter02.section06;

// chapter02/section06/Main.java
public class Main {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 7;
        // 逻辑与
        System.out.println("==逻辑与==");
        System.out.println((a > b) & (a > c)); // false
        System.out.println((a > b) & (a < c)); // false
        System.out.println((a < b) & (a < c)); // true
        // 逻辑或
        System.out.println("==逻辑或==");
        System.out.println((a > b) | (a > c)); // false
        System.out.println((a > b) | (a < c)); // true
        System.out.println((a < b) | (a < c)); // true
        // 逻辑异或
        System.out.println("==逻辑异或==");
        System.out.println((a > b) ^ (a > c)); // false
        System.out.println((a > b) ^ (a < c)); // true
        System.out.println((a < b) ^ (a < c)); // false
        // 短路与
        System.out.println("==短路与==");
        System.out.println((a > b) && (a > c)); // false
        System.out.println((a > b) && (a < c)); // false
        System.out.println((a < b) && (a < c)); // true
        // 短路或
        System.out.println("==短路或==");
        System.out.println((a > b) || (a > c)); // false
        System.out.println((a > b) || (a < c)); // true
        System.out.println((a < b) || (a < c)); // true
    }
}
