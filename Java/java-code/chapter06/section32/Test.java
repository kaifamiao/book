package chapter06.section32;

// chapter06/section32/Test.java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 定义主人对象
        Host host = new Host();
        // 选择宠物
        Scanner input = new Scanner(System.in);
        System.out.println("请输入宠物，1：狗狗；2：鸭子；3：猫");
        int choice = input.nextInt();
        Pet pet = null;
        switch (choice) {
            case 1:
                System.out.println("主人选择的是狗狗");
                pet = new Dog();
                break;
            case 2:
                System.out.println("主人选择的是鸭子");
                pet = new Duck();
                break;
            case 3:
                System.out.println("主人选择的是猫");
                pet = new Cat();
                break;
        }
        // 主人听宠物的叫声
        host.letCall(pet);
        System.out.println("************");
    }
}
