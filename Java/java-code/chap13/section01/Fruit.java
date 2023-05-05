package chap13.section01;

// chap13/section01/Fruit.java
public class Fruit {
    public void info() {
        System.out.println("水果的info()方法");
    }
}

class Apple extends Fruit {
    // 使用 @Override注解指定下面的 info() 方法是对父类 info() 法的重写
    @Override
    public void info() {
        System.out.println("苹果重写水果的info()方法");
    }


}
