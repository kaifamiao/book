package chap09.section09;

// chap09/section09/LambdaTest04.java
public interface LambdaTest04 {
    int method(int x, int y);
}

class Test04 {
    public static void main(String[] args) {
        LambdaTest04 t;

        t = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(t.method(2, 5));

        t = (x, y) -> {
            return x + y;
        };
        System.out.println(t.method(2, 5));

        t = (x, y) -> x + y;
        System.out.println(t.method(2, 5));

        t = (x, y) -> sum(x, y);
        System.out.println(t.method(2, 5));
    }

    public static int sum(int x, int y) {
        return (x + y);
    }
}
