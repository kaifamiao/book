package chap11.section08;

// chap11/section08/ComparatorExample.java
import java.util.Arrays;

public class ComparatorExample {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("小张", 58, 85);
        students[1] = new Student("小王", 67, 87);
        students[2] = new Student("小孙", 79, 83);
        students[3] = new Student("小李", 80, 89);
        students[4] = new Student("小高", 81, 81);
        // 比较语文成绩
        Arrays.sort(students, new ChineseComparator());
        System.out.println("语文成绩排序");
        for (Student student : students) {
            System.out.println(student);
        }
        // 比较数学成绩
        Arrays.sort(students, new MathComparator());
        System.out.println("数学成绩排序");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

