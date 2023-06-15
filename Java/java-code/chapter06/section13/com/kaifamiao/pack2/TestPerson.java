package chapter06.section13.com.kaifamiao.pack2;

// chapter06/section13/com/kaifamiao/pack2/testPerson.java
// 使用Person类时，使用import将Person类导入
import chapter06.section13.com.kaifamiao.pack1.Person;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person("喵星人",20,"男");
        person.say();
    }
}
