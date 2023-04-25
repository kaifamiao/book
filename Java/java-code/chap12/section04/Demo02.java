package chap12.section04;

// chap12/section04/Demo02.java
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class Demo02 {

    public static void main(String[] args) {
        // 获取Person类的Class对象
        Class clazz = Person.class;
        Constructor constructor = null;
        try {
            // 获取Person类带有String、int、boolean、List<String>参数的构造方法
            constructor = clazz.getConstructor(String.class, int.class, boolean.class, List.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        try {
            // 调用构造newInstance方法创建Person对象
            Person instance = (Person)constructor.newInstance("John", 30, true,
                    Arrays.asList("reading", "traveling"));
            System.out.println(instance);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
