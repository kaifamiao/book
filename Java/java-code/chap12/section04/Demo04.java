package chap12.section04;

// chap12/section04/Demo04.java
import java.lang.reflect.Method;

public class Demo04 {

    public static void main(String[] args) throws Exception {
        // 创建Student对象
        Student s = new Student();
        // 获取Student对应的Class对象
        Class clazz = Student.class;
        // 得到Student类的setName()方法
        Method method = clazz.getMethod("setName", String.class);
        // 调用setName()方法，为name赋值
        method.invoke(s, "张顺");//相当于s.setName("张顺");
        // 得到Student类的getName()方法
        Method method1 = clazz.getMethod("getName");
        // 调用getName()方法，获取name的值
        Object obj = method1.invoke(s); //相当于s.getName();
        System.out.println(obj); // 张顺
    }
}