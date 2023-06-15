package chapter06.section30;

// chapter06/section30/Test02
public class Test02 {

    public static void main(String[] args) {
        Pet pet = null;
        pet = new Dog();
        pet.toHospital(); // 狗狗看病
        pet = new Bird();
        pet.toHospital(); // 小鸟看病
    }
}
