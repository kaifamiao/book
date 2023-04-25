package chap12.section03;

// chap12/section03/Student.java
import java.io.Serializable;

//可序列化的类必须实现Serializable接口
public class Student implements Serializable{
    private String name;  // name字段
    private int score;    // score字段
    public Student(String name, int score) {
        super();
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

