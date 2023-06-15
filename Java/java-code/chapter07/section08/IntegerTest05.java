package chapter07.section08;

// chapter07/section08/IntegerTest05.java
public class IntegerTest05 {

    public static void main(String[] args) {
        Integer d = Integer.decode("123");
        System.out.println(d); // 123

        Integer a = 100;
        Integer b = 100;
        System.out.println(Integer.compare(a, b));  // 0
        System.out.println(Integer.compare(-a, b)); // -1
        System.out.println(Integer.compare(a, -b)); // 1
        System.out.println(a.equals(b)); // true

        int i = Integer.parseInt("123");
        System.out.println(i); // 123
        System.out.println(Integer.signum(-123)); // -1
        System.out.println(Integer.signum(123));  // 1
        System.out.println(Integer.signum(0));    // 0
        System.out.println(Integer.toBinaryString(10)); // 1010
        System.out.println(Integer.toOctalString(10));  // 12
        System.out.println(Integer.toHexString(10));    // a

        String s = Integer.toString(123);
        System.out.println(s); // 123

        Integer int1 = Integer.valueOf("123");
        System.out.println(int1); // 123
    }

}
