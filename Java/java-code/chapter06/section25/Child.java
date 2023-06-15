package chapter06.section25;

// chapter06/section25/Child.java
public class Child extends Parent {

    private String school;

    public Child(String name, int age, String school) {
        super(name, age);  // 调用父类的构造
        this.school = school;
    }

    // 重写父类方法
    @Override
    public void printInfo() {
        super.printInfo();  // 调用父类方法
        System.out.println("School: " + school);
    }
}

class Test {
    public static void main(String[] args) {
        Child c = new Child("Jerry", 10, "Primary School");
        c.printInfo(); // 调用重写父类的方法
    }
}


