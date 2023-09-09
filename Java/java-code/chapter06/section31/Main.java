package chapter06.section31;


// chapter06/section31/Main.java
import java.util.Scanner;

public class Main {
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
        // 使用getClass()方法进行类型转换的判断
        if (pet.getClass() == Dog.class) {  // 判断pet执行的是否是Dog类
            Dog dog = (Dog)pet; // 将pet转换为Dog类型
            dog.catchingFlyDisc();
        }
        if (pet.getClass() == Bird.class) { // 判断pet执行的是否是Dog类
            Bird bird = (Bird)pet; // 将pet转换为Bird类型
            bird.fly();
        }
    }
}

