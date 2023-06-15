package chapter11.section09;

// chapter11/section09/SortExample.java
import chapter11.section08.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        List students = new ArrayList();
        students.add(new Student("小高", 58, 85));
        students.add(new Student("小孙", 67, 87));
        students.add(new Student("小杨", 79, 83));
        students.add(new Student("小张", 80, 89));
        students.add(new Student("小王", 81, 81));
        System.out.println("----排序前----");
        students.forEach(e-> System.out.println((Student)e));
        System.out.println("----排序后----");
        // 按照 Student 类里面定义的自然顺序排序
        Collections.sort(students);
        students.forEach(e-> System.out.println((Student)e));
    }
}
