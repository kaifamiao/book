package chapter06.section27;

// chapter06/section27/ObjectExample.java
public class ObjectExample {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Alice", 25);

        System.out.println(person1.equals(person2)); // false
        System.out.println(person1.equals(person3)); // true

        System.out.println(person1.hashCode()); // 558638686 （假设的哈希码）
        System.out.println(person2.hashCode()); // 1149319664 （假设的哈希码）
        System.out.println(person3.hashCode()); // 2093631819 （假设的哈希码）

        System.out.println(person1.toString()); // Person{name='Alice', age=25}
        System.out.println(person2); // Person{name='Bob', age=30}
    }
}

