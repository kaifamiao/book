package chapter06.section13.com.kaifamiao.pack1;

// chapter06/section13/com/kaifamiao/pack1/Person.java
public class Person {

    // 定义成员变量
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 定义自我介绍方法
    public void say() {
        System.out.println("自我介绍一下，姓名：" + this.name + "，性别：" + this.gender
                + "，年龄：" + this.age);
    }
}