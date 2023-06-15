package chapter11.section06;

// chapter11/section06/RecordExample.java
public class RecordExample {

    public static void main(String[] args) {
        Person person = new Person("John", 30, "123 Main St");
        System.out.println(person.name());
        System.out.println(person.age());
        System.out.println(person.address());
        Person person2 = new Person("John", 30, "123 Main St");
        System.out.println(person.equals(person2));
        System.out.println(person.toString());
    }
}
