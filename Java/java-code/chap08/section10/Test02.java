package chap08.section10;

// chap08/section10/Test02.java
import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        // 定义主人对象
        Person person = new Person();
        // 选择送出的宠物
        Scanner input = new Scanner(System.in);
        System.out.println("请输入送出的宠物，1：dog；2：duck；3：cat");
        String type = input.next();
        Pet pet = person.donateAnimal(type);
        System.out.println("主人送出的是：" + type);
        // 听听宠物的叫声
        pet.call();
        System.out.println("************");
    }
}
