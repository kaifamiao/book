package chapter09.section01;

// chapter09/section01/Pet.java
public abstract class Pet {

    private String name = "无名氏"; // 昵称
    private int health = 100;     // 健康值
    private int love = 0;         // 亲密度
    // 有参构造方法
    public Pet(String name) {
        this.name = name;
    }
    // 输出宠物信息
    public void print() {
        System.out.println("宠物的自白:\n我的名字叫"
                + this.name + "，健康值是"
                + this.health + "，和主人的亲密度是"
                + this.love + "。");
    }
}

class Test {
    public static void main(String[] args) {
        // Pet pet = new Pet("大黄");   // 错误，抽象类不能被实例化
        // pet.print();
    }
}
