package chap08.section01;

// chap08/section01/Child.java
public class Child extends Parent {

    private String school;

    public Child(String school) {
        this.school = school;
    }

    public void printSchool() {
        System.out.println("School: " + school);
    }
}

