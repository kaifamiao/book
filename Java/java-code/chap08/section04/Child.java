package chap08.section04;

// chap08/section04/Child.java
public class Child extends Parent {

    public String name = "子类";
    public static int age = 12;
    public static final double weight = 23;
    public static String key = "kfm-mxr2";

    public static void print() {
        System.out.println("Child.print()");
    }

    public void printInfo() {
        System.out.println("name = " + name + ", age = "
                + age + ", weight = " + weight + ", key = " + key);
    }
}
