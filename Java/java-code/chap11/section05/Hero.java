package chap11.section05;

// chap11/section05/Hero.java
public class Hero {// 定义好汉类
    private String name;// 好汉姓名
    private String gender;// 好汉性别

    public Hero(String name, String gender) {
        super();
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
