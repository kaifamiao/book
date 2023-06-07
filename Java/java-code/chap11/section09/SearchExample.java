package chap11.section09;

// chap11/section09/SearchExample.java
import chap11.section08.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchExample {

    public static void main(String[] args) {
        List students = new ArrayList();
        Student student = new Student("小张", 80, 89);
        students.add(new Student("小高", 58, 85));
        students.add(new Student("小孙", 67, 87));
        students.add(new Student("小杨", 79, 83));
        students.add(new Student("小张", 80, 89));
        students.add(new Student("小王", 81, 81));
        // 排序前
        System.out.println("----排序前----");
        students.forEach(e-> System.out.println((Student)e));
        int index = Collections.binarySearch(students, student);
        System.out.println("【排序前小张的索引是" + index + "】");
        // 排序
        System.out.println("----排序后----");
        Collections.sort(students);
        students.forEach(e-> System.out.println((Student)e));
        // 查找元素
        index = Collections.binarySearch(students, student);
        System.out.println("【排序后小张的索引是" + index + "】");
    }
}
