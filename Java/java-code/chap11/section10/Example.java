package chap11.section10;

// chap11/section10/Example.java
public class Example {

    public static void main(String[] args) {
        StudentName<String> student = new Student<String>("喵星人");
        System.out.println(student.getName()); // 喵星人
    }
}

interface StudentName<T> {    // T的 类型由外部传入
    public T getName();
}

class Student<T> implements StudentName<T> { // T的类型由外部传入
    private T name;   // T传入什么类型，name就是什么类型，因此name的类型被参数化

    public Student(T name) {
        super();
        this.name = name;
    }

    public T getName() {
        return this.name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
