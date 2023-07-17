package chapter06.section12;

// chapter06/section12/Person.java
public class Person {

    public String name; // 姓名属性
    public String gender; // 性别属性
    public int age; // 年龄属性

    public static void main(String[] args) {
        // 实例化第一个Person对象
        Person songJiang = new Person();
        songJiang.name = "宋江";
        songJiang.gender = "男";
        songJiang.age = 22;
        // 实例化第二个Person对象
        Person huaRong = new Person();
        huaRong.name = "华荣";
        huaRong.gender = "男";
        huaRong.age = 21;
        // 实例化第三个Person对象
        Person huSanNiang = new Person();
        huSanNiang.name = "扈三娘";
        huSanNiang.gender = "女";
        huSanNiang.age = 18;
        // 定义Person类型的数组，并初始化数组元素
        Person[] persons = new Person[]{
                songJiang,
                huaRong,
                huSanNiang
        };
        // 输出
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].name + "，" + persons[i].gender
                    + "，" + persons[i].age);
        }
    }
}

