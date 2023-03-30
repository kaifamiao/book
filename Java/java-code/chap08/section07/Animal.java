package chap08.section07;

// chap08/section07/Animal.java
public class Animal {
    public final void sayHello() {
        System.out.println("Hello from Animal");
    }
}

class Dog extends Animal {
    // 无法重写 sayHello() 方法
}

class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sayHello(); // Hello from Animal
    }
}