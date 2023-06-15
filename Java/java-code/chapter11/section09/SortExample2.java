package chapter11.section09;

// chapter11/section09/SortExample2.java
import chapter11.section08.MathComparator;
import chapter11.section08.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample2 {

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
        // 按照定义好的比较器排序 -- 按照数学成绩排序
        Collections.sort(students,new MathComparator());
        students.forEach(e-> System.out.println((Student)e));
    }
}
