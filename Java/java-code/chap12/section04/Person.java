package chap12.section04;

// chap12/section04/Person.java
import java.util.List;

public class Person{

    private String name;
    private int age;
    private boolean isMarried;
    private List<String> hobbies;

    public Person(String name, int age, boolean isMarried, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.hobbies = hobbies;
    }
    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                ", hobbies=" + hobbies +
                '}';
    }
}
