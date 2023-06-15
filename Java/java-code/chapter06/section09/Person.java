package chapter06.section09;

// chapter06/section09/Person.java
public class Person {

    public String name;
    public String gender;
    public int age;

    // 第一种重载：无参的工作方法
    public void work() {
        System.out.println(this.name + "的工作理念：工作让生活更美好");
    }

    // 第二种重载：带一个String类型参数的工作方法
    public void work(String content) {
        System.out.println(this.name + "的工作理念：" + content);
    }
}
