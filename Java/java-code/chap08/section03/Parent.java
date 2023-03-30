package chap08.section03;

// chap08/section03/Parent.java
public class Parent {

    protected int age;
    protected String name;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Parent() {}

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}