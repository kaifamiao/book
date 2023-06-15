package chapter06.section31;

// chapter06/section31/Test.java
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入宠物，1：狗狗；2：小鸟");
        int choice = input.nextInt();
        Pet pet = null;
        switch (choice) {
            case 1:
                pet = new Dog();
                break;
            case 2:
                pet = new Bird();
                break;
        }
        pet.toHospital();
        if (pet instanceof Dog dog) {  // 判断pet执行的是否是Dog类
            dog.catchingFlyDisc();
        }
        if (pet instanceof Bird bird) { // 判断pet执行的是否是Dog类
            bird.fly();
        }
    }
}