package chap11.section08;

// chap11/section08/Student.java
public class Student implements Comparable {
    // 定义字段
    private String name;
    private int math;
    private int chinese;
    // 构造函数
    public Student(String name, int math, int chinese) {
        super();
        this.name = name;
        this.math = math;
        this.chinese = chinese;
    }
    // 获取总成绩
    public int getTotal() {
        return math + chinese;
    }
    // 根据总成绩重写比较器方法
    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        int result = this.getTotal() - s.getTotal();
        if (result == 0) {
            return this.equals(s) ? 0 : 1;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", math=" + math +
                ", chinese=" + chinese + ", total=" + getTotal() + "]";
    }

    // getter and setter
    public int getMath() {
        return math;
    }
    public int getChinese() {
        return chinese;
    }

}