package chap11.section08;

// chap11/section08/ComparableExample.java
import java.util.TreeSet;

public class ComparableExample {

    public static void main(String[] args) {
        TreeSet students = new TreeSet();
        students.add(new Student("小张", 58, 85));
        students.add(new Student("小王", 67, 87));
        students.add(new Student("小孙", 79, 83));
        students.add(new Student("小李", 80, 89));
        students.add(new Student("小吴", 81, 81));
        students.add(new Student("小高", 82, 80));
        students.forEach(e -> System.out.println((Student)e));
        System.out.println(students.size());
    }
}
