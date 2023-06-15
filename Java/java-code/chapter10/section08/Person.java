package chapter10.section08;

// chapter10/section08/Person.java
public class Person {
    private String name = "";
    private int age = 0;
    private String gender = "男";

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

    // 使用throws声明方法抛出GenderException异常
    public void setGender(String gender) throws GenderException {
        if ("男".equals(gender) || "女".equals(gender)) {
            this.gender = gender;
        } else {
            // 使用throw抛出GenderException异常
            throw new GenderException("性别必须是男或女");
        }
    }

    public void print() {
        System.out.println("姓名：" + this.name + "，性别" + this.gender
                + "，年龄" + this.age);
    }
}