package chap08.section09;

// chap08/section09/Pet.java
public class Pet {
    public void toHospital() {
        System.out.println("宠物看病");
    }
}

class Dog extends Pet {
    public void toHospital() {
        System.out.println("狗狗看病");
    }
    public void catchingFlyDisc() {
        System.out.println("接飞盘");
    }
}

class Bird extends Pet {
    public void toHospital() {
        System.out.println("小鸟看病");
    }
    public void fly() {
        System.out.println("飞翔");
    }
}

