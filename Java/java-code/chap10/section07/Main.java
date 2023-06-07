package chap10.section07;

// chap10/section07/Main.java
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setName("扈三娘");
            person.setAge(18);
            person.setGender("Female");
            person.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String name = ""; // 姓名
    private int age = 0; // 年龄
    private String gender = "男";// 性别

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws Exception {
        if ("男".equals(gender) || "女".equals(gender)) {
            this.gender = gender;
        } else {
            throw new Exception("性别必须是男或女");
        }
    }

    public void print() {
        System.out.println("姓名：" + this.name + "，性别" + this.gender
                + "，年龄" + this.age);
    }
}