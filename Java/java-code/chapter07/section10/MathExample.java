package chapter07.section10;

// chapter07/section10/MathExample.java
public class MathExample {

    public static void main(String[] args) {
        int num = -5;
        int absNum = Math.abs(num);
        System.out.println(absNum); // 5
        double n = 16.0;
        double sqrtNum = Math.sqrt(n);
        System.out.println(sqrtNum); // 4.0
        double base = 2.0;
        double exponent = 3.0;
        double result = Math.pow(base, exponent);
        System.out.println(result); // 8.0
        int num1 = 10;
        int num2 = 7;
        int maxNum = Math.max(num1, num2);
        System.out.println(maxNum); // 10
        int minNum = Math.min(num1, num2);
        System.out.println(minNum); // 7
        double n1 = 4.2;
        double ceilNum = Math.ceil(n1);
        System.out.println(ceilNum); // 5.0
        double floorNum = Math.floor(n1);
        System.out.println(floorNum); // 4.0
        double n2 = 4.6;
        long roundedNum = Math.round(num);
        System.out.println(roundedNum); // 5
        double randomNum = Math.random();
        System.out.println(randomNum); // 0.0~1.0
    }
}
