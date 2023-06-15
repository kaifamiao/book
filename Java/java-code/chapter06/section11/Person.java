package chapter06.section11;

// chapter06/section11/Person.java
public class Person {

    public String name;
    public String gender;
    public int age;

    // 第一种构造方法重载：定义无参构造方法
    public Person() {
        this.name = "宋江";
    }

    // 第二种构造方法重载：定义带参构造方法
    public Person(String name) {
        this.name = name;
    }

    // 第一种work()方法重载：无参的work()方法
    public void work() {
        System.out.println(this.name + "的工作理念：工作让生活更美好");
    }

    // 第二种work()方法重载：带参的work()方法
    public void work(String content) {
        System.out.println(this.name + "，" + this.gender + "，" + this.age
                + "岁，" + (this.gender == "男" ? "他" : "她") + "的工作理念：" + content);
    }
}
