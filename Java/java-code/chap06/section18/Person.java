package chap06.section18;

// chap06/section18/Person.java
public class Person {

    // 定义成员变量
    private String name;
    private int age;
    private String gender;

    // 定义getter/setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("输出错误，年龄" + age + "不合法，请重新输入");
            return;
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if ("男".equals(gender) || "女".equals(gender)) {
            this.gender = gender;
        } else {
            System.out.println("性别不合法");
        }
    }

    // 定义构造方法
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "无名氏";
        this.age = 18;
        this.gender = "男";
    }

    // 定义自我介绍方法
    public void say() {
        System.out.println("自我介绍一下，姓名：" + this.name + "，性别：" + this.gender
                + "，年龄：" + this.age);
    }
}
