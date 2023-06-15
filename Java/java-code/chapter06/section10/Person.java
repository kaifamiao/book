package chapter06.section10;

// chapter06/section10/Person.java
public class Person {

    public String name;
    public String gender;
    public int age;

    // 第一种重载：无参的工作方法
    public void work() {
        System.out.println(this.name + "的工作理念：工作让生活更美好");
    }

    // 第二种重载：带参的工作方法
    public void work(String content) {
        System.out.println(this.name + "的工作理念：" + content);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "喵星人";
        p.gender = "男";
        p.age = 22;
        p.work(); // 调用没有参数的方法
        p.work("实现自身价值和理想"); // 调用带有一个String参数的方法
    }
}
