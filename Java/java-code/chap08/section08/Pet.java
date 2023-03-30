package chap08.section08;

// chap08/section08/Pet.java
public class Pet {

    public void toHospital() {
        System.out.println("宠物看病");
    }
}

class Dog extends Pet {

    public void toHospital() {
        System.out.println("狗狗看病");
    }
}

class Bird extends Pet {

    public void toHospital() {
        System.out.println("小鸟看病");
    }
}
