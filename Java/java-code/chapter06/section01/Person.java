package chapter06.section01;

// chapter06/section01/Person.java
public class Person { //定义人类

    public String name;   // 定义姓名字段
    public String gender; // 定义性别字段
    public int age;       // 定义年龄字段

    // 定义工作方法
    public void work() {
        System.out.println(this.name + "的工作理念：工作让生活更美好");
    }
}
