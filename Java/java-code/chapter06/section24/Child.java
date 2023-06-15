package chapter06.section24;

// chapter06/section24/Child.java
public class Child extends Parent {

    private String school;

    public Child(String name, int age, String school) {
        super(name, age);  // 调用父类的构造
        this.school = school;
    }
}

class Test {
    public static void main(String[] args) {
        Child c = new Child("Jerry", 10, "Primary School");
        c.printInfo(); // 调用继承父类的方法
    }
}