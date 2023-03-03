package chap06.section11;

// chap06/section11/PersonTester.java
import java.util.Scanner;

public class PersonTester {

    public static void main(String[] args) {
        Person person = new Person("喵星人"); // 调用Person带有参数构造方法创建对象
        System.out.println("大家好，欢迎" + person.name + "的到来");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择性别：（1、男，2、女）");
        switch (scanner.nextInt()) {
            case 1 -> person.gender = "男"; // 为person对象的性别属性赋值
            case 2 -> person.gender = "女"; // 为person对象的性别属性赋值
            default -> {
                System.out.println("输入错误");
                return;
            }
        }
        System.out.println("请输入年龄");
        person.age = scanner.nextInt(); // 为person对象的年龄属性赋值
        person.work();  // 调用无参的work()方法
        System.out.println("请重新输入您的工作理念");
        String content = scanner.next();
        person.work(content); // 调用带参的work()方法
    }
}
