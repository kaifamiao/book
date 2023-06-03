package chap07.section08;

// chap07/section08/IntegerTest04
public class IntegerTest04 {

    public static void main(String[] args) {
        int a = 100;
        Integer b = 100;
        System.out.println(a == b); // true
        Integer c = 100;
        Integer d = 100;
        System.out.println(c == d); // true
        Integer num1 = new Integer(100);
        Integer num2 = new Integer(100);
        System.out.println(num1 == num2); // false
        c = 200;
        d = 200;
        System.out.println(c == d); // false
    }
}
