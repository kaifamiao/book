package chap06.section23;

// chap06/section23/Child.java
public class Child extends Parent {

    private String school;

    public Child(String school) {
        this.school = school;
    }

    public void printSchool() {
        System.out.println("School: " + school);
    }
}

