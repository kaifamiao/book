package Chapter04;
//Chapter04/Classmate.java
public class Classmate {
    private int id;
    private String name;
    private int age;
    private String job;
    private String city;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age +
                ", job='" + job + '\'' + ", city='" + city + '\'' + '}';
    }
}
