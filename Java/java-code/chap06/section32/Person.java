package chap06.section32;

// chap06/section32/Person.java
public class Person {

    public Pet donateAnimal(String type) {
        Pet pet = null;
        if ("dog".equals(type)) {
            pet = new Dog();
        } else if ("cat".equals(type)) {
            pet = new Cat();
        } else {
            pet = new Duck();
        }
        return pet;
    }
}
