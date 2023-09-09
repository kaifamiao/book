package chapter06.section19;

// chapter06/section19/Person.java
public class Person {

    private String name;

    public void setName(String name) {
        // 局部变量name遮蔽了成员变量name，使用this.name引用成员变量
        this.name = name;
    }
}

