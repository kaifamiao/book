package chapter09.section07;

// chapter09/section07/Bird.java
// 鸟的抽象类
public abstract class Bird {

    private final ShoutAbility shoutAbility; // 鸟叫的方式
    // 鸟类的构造方法，用来初始化鸟叫的行为
    public Bird(ShoutAbility shoutAbility) {
        this.shoutAbility = shoutAbility;
    }
    // 鸟叫
    public void shout() {
        shoutAbility.shout(); // 调用接口中鸟叫的方法
    }
    // 飞行
    public void fly() {
        System.out.println("弹射飞");
    }
    public abstract void attack(); // 攻击
}

// 炸弹鸟
class BombBird extends Bird {
    public BombBird(ShoutAbility shoutAbility) {
        super(shoutAbility);
    }
    // 重写攻击方法
    public void attack() {
        System.out.println("炸弹攻击");
    }
}

// 分裂鸟
// 分裂攻击
class SplitBird extends Bird {
    public SplitBird(ShoutAbility shoutAbility) {
        super(shoutAbility);
    }
    // 重写攻击方法
    public void attack() {
        System.out.println("分裂攻击");
    }
}