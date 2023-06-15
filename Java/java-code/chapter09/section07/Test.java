package chapter09.section07;

// chapter09/section07/Test.java
public class Test {

    public static void main(String[] args) {
        ShoutAbility aoShout = new AoShout();    // 嗷嗷叫
        ShoutAbility zhaShout = new ZhaShout();  // 喳喳叫
        Bird bomb = new BombBird(aoShout);      // 炸弹鸟，喳喳叫
        Bird split = new SplitBird(zhaShout);   // 分裂鸟，嗷嗷叫
        System.out.print("炸弹鸟");
        bomb.fly();
        bomb.shout();
        bomb.attack();
        System.out.print("分裂鸟");
        split.fly();
        split.shout();
        split.attack();
    }
}
