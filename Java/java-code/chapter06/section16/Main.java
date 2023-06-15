package chapter06.section16;

// chapter06/section16/Main.java
public class Main {

    static int num;

    static {
        num = 10;
        System.out.println("静态初始化块执行，num = " + num);
    }

    public static void main(String[] args) {
        System.out.println("main方法执行，num = " + num);
        Main main = new Main();
        System.out.println("创建Main对象");
    }

public class Person {
    private int age;
    private String name;
    private String gender;
}
}
