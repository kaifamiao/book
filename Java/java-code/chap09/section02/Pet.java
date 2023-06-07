package chap09.section02;

// chap09/section02/Pet.java
public abstract class Pet {
    private String name = "无名氏"; // 昵称
    private int health = 100; // 健康值
    private int love = 0; // 亲密度
    public Pet(String name) {
        this.name = name;
    }
    //定义抽象方法，让子类去重写，用于输出宠物信息
    public abstract void print() ;
    //省略getter/setter方法
}

class Dog extends Pet {
    private String strain; // 品种
    public Dog(String name, String strain) {
        super(strain);
        this.strain = strain;
    }
    public String getStrain() {
        return this.strain;
    }
    // 重写父类的print()方法，用于输出狗狗信息
    public void print() {
        System.out.println("我是一只"+this.strain+"。");
    }
}
