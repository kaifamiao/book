package chap06.section28;

// chap06/section28/Person.java
public class Person {
    String name; // 姓名
    public Person() {
        System.out.println("execute Person()");
    }
    public Person(String name) {
        this.name = name;
        System.out.println("execute Person(name)");
    }
}

class Student extends Person {
    String school; // 学校
    public Student() {
        System.out.println("execute Student()");
    }
    public Student(String name, String school) {
        super(name); // 显式调用父类有参构造方法，将不执行无参构造方法
        this.school = school;
        System.out.println("execute Student(name,school)");
    }
}

class PostGraduate extends Student {
    String guide; // 导师
    public PostGraduate() {
        System.out.println("execute PostGraduate()");
    }
    public PostGraduate(String name, String school, String guide) {
        super(name, school);
        this.guide = guide;
        System.out.println("execute PostGraduate(name,school,guide)");
    }
}
