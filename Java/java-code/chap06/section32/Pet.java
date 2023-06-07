package chap06.section32;

// chap06/section32/Pet.java
public class Pet {
    public void call() {
    }
}

class Dog extends Pet {
    public void call() {
        System.out.println("狗狗叫声：旺旺");
    }
}

class Cat extends Pet{
    public void call() {
        System.out.println("猫的叫声：喵喵");
    }
}

class Duck extends Pet {
    public void call() {
        System.out.println("鸭子叫声：嘎嘎");
    }
}

