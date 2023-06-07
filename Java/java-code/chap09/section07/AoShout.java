package chap09.section07;

// chap09/section07/AoShout.java
public class AoShout implements ShoutAbility {
    @Override
    public void shout() {
        System.out.println("嗷嗷叫");
    }
}

class ZhaShout implements ShoutAbility {
    public void shout() {
        System.out.println("喳喳");
    }
}