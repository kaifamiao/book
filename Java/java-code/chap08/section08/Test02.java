package chap08.section08;

// chap08/section08/Test02
public class Test02 {

    public static void main(String[] args) {
        Pet pet = null;
        pet = new Dog();
        pet.toHospital(); // 狗狗看病
        pet = new Bird();
        pet.toHospital(); // 小鸟看病
    }
}
