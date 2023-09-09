package chapter12.section04;

// chapter12/section04/Student.java
public class Student {
    private String name;
    private int age;
    public String toString() {
        return "name is " + this.name + ", age is " + this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
