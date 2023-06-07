package chap06.section26;

// chap06/section26/Parent.java
public class Parent {

    public static String name = "父类";
    public static int age = 20;
    public double weight = 45.5;
    public static String key = "kfm-mxr";

    public static void print() {
        System.out.println("Parent.print()");
    }

    public void printInfo() {
        System.out.println("name = " + name + ", age = "
                + age + ", weight = " + weight + ", key = " + key);
    }
}