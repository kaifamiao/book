package chapter06.section22;

// chapter06/section22/Person.java
public class Person {

    private String name;
    private int age;

    public Person() {
        this("Tom", 20);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

