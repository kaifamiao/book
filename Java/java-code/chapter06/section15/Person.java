package chapter06.section15;

// chapter06/section15/Person.java
public class Person {

    // 定义静态方法
    public static void showDetails(String name, int age) {
        System.out.println("自我介绍一下，姓名：" + name + "，年龄：" + age);
    }

    public static void main(String[] args) {
        Person.showDetails("小张", 20);  // 类名直接调用静态方法
        Person person = new Person();
        person.showDetails("小杨", 19);  // 对象名调用静态方法，不推荐这种用法
    }
}
