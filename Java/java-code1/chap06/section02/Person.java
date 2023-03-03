package chap06.section02;

// chap06/section02/Person.java
public class Person { // 定义Person类

    public String name; // 定义姓名字段
    public String gender;// 定义性别字段
    public int age;// 定义年龄字段

    // 定义work法
    public void work() {
        System.out.println(this.name + "的工作理念：工作让生活更美好");
    }

    public static void main(String[] args) {
        Person miao = new Person(); // 实例化对象miao
        miao.name = "喵星人"; // 为对象的name字段赋值
        miao.gender = "男"; // 为对象的gender字段赋值
        miao.age = 22; // 为对象的age字段赋值
        miao.work(); // 调用对象的work()方法
    }
}
