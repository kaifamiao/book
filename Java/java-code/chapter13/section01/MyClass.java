package chapter13.section01;

// chapter13/section01/MyClass.java
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnnotation(value = "Hello Annotation")
public class MyClass {
    public static void main(String[] args) {
        // 获取MyClass类上的所有注解
        Class<MyClass> clazz = MyClass.class;
        Annotation[] annotations = clazz.getAnnotations();

        // 遍历并处理注解
        for (Annotation annotation : annotations) {
            if (annotation instanceof MyAnnotation) {
                MyAnnotation myAnnotation = (MyAnnotation) annotation;
                String value = myAnnotation.value();
                System.out.println("Value of MyAnnotation: " + value);
            }
        }
    }
}

