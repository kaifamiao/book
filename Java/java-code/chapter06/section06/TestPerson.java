package chapter06.section06;

// chapter06/section06/TestPerson.java
public class TestPerson {

    public static void main(String[] args) {
        //基本数据类型
        System.out.println("***** 基本数据类型 ****");
        int num1 = 11;
        int num2 = num1;
        System.out.println("num1=" + num1);
        num2 = 22;
        System.out.println("把num1赋给num2后，修改num2的值，num1=" + num1);
        //引用数据类型
        System.out.println("***** 引用数据类型 ****");
        Person person1 = new Person();
        person1.age = 11;
        Person person2 = person1;
        System.out.println("person1.age=" + person1.age);
        person2.age = 22;
        System.out.println("把person1对象赋给person2对象，" +
                "修改person2对象的age属性值后，person1.age=" + person1.age);
    }
}



