package chap08.section03;

// chap08/section03/Child.java
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


