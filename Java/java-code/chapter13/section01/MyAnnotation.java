package chapter13.section01;

// chapter13/section01/MyAnnotation.java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "default value";
}
