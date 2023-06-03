package chap06.section12;

// chap06/section12/Person.java
public class Person {

    public String name; // 定义姓名属性
    public String gender; // 定义性别属性
    public int age; // 定义年龄属性

    public static void main(String[] args) {
        // 实例化第一个Person对象
        Person zs = new Person();
        zs.name = "宋江";
        zs.gender = "男";
        zs.age = 22;
        // 实例化第二个Person对象
        Person ls = new Person();
        ls.name = "华荣";
        ls.gender = "男";
        ls.age = 21;
        // 实例化第三个Person对象
        Person ww = new Person();
        ww.name = "扈三娘";
        ww.gender = "女";
        ww.age = 18;
        // 定义Person类型的数组，并初始化数组元素
        Person[]persons =new Person[]{
                zs,
                ls,
                ww
        };
        // 输出
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].name+"，"+persons[i].gender
                    +"，"+persons[i].age);
        }
    }
}
