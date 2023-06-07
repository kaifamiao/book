package chap11.section10;

// chap11/section10/HeroExample.java
public class HeroExample {
    public static void main(String[] args) {
        Hero<String, String> hero = new Hero<>("鼓上蚤", "时迁");
        hero.show(); // 鼓上蚤时迁
    }
}

class Hero<F, L> {
    F first;
    L last;

    public Hero(F first, L last) {
        super();
        this.first = first;
        this.last = last;
    }

    public void show() {
        System.out.println(first.toString() + last);
    }
}
