package chapter13.section01;

// chapter13/section01/AnnotationExample.java
import java.lang.annotation.Annotation;

public class AnnotationExample {

    public static void main(String[] args) throws Exception {
        // 获取 MyAnnotation类的 info()方法的所有注解
        Annotation[] arr = Class.forName("chapter13.section01.Apple")
                .getMethod("info").getAnnotations();
        // 遍历所有注解
        for (Annotation an :arr) {
            System.out.println(an);
        }
    }
}
