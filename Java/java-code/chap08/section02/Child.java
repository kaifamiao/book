package chap08.section02;

// chap08/section02/Child.java
public class Child extends Parent {

    private String school;

    public Child(String name, int age, String school) {
        super(name, age);  // 调用父类的构造
        this.school = school;
    }

}