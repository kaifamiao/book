package chapter06.section14;

// chapter06/section14/Person.java
public class Person {

    public static int PERSON_LIVE; // 类变量：人的生命次数

    public static void main(String[] args) {
        Person.PERSON_LIVE = 1;  // 所有人的生命都只有一次
        System.out.println(Person.PERSON_LIVE);
    }
}
