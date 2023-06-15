package chapter06.section18;

// chapter06/section18/PersonTester.java
public class PersonTester {

    // 定义main()方法
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("喵星人");
        person.setGender("男");
        person.setAge(20);
        person.say();
        Person person2 = new Person("小王", 22, "女");
        person2.say();
    }
}
