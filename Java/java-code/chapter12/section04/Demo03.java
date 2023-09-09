package chapter12.section04;

// chapter12/section04/Demo03.java
import java.lang.reflect.Field;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        // 创建 Person 对象
        Person person = new Person();
        // 获取Person对应的Class对象
        Class clazz = Person.class;
        // 获取Person类的name属性，使用getDeclaredField()方法可获取私有属性
        Field field = clazz.getDeclaredField("name");
        // 设置通过反射访问该Field时取消权限检查
        field.setAccessible(true);
        // 调用set()方法为s对象的指定Field设置值
        field.set(person, "孙立");

        // 获取Person类的age属性，使用getDeclaredField()方法可获取私有属性
        Field field1 = clazz.getDeclaredField("age");
        // 设置通过反射访问该Field时取消权限检查
        field1.setAccessible(true);
        // 调用setInt()方法为s对象的指定Field设置值
        field1.setInt(person, 20);
        System.out.println(person);
    }
}
