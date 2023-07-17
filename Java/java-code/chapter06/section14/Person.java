package chapter06.section14;

// chapter06/section14/Person.java
public class Person {

    public static int person_live; // 类变量：人的生命次数

    public static void main(String[] args) {
        Person.person_live = 1;  // 所有人的生命都只有一次
        System.out.println(Person.person_live);
    }
}
