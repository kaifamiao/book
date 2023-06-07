package chap11.section10;

// chap11/section10/BoxTest.java
public class BoxTest {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addItem(new Apple());
        System.out.println(BoxUtil.containsFruit(appleBox)); // true

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addItem(new Orange());
        System.out.println(BoxUtil.containsFruit(orangeBox)); // true

        Box<Banana> bananaBox = new Box<>();
        bananaBox.addItem(new Banana());
        System.out.println(BoxUtil.containsFruit(bananaBox)); // true

        Box<String> stringBox = new Box<>();
        stringBox.addItem("Hello");
        System.out.println(BoxUtil.containsFruit(stringBox)); // false
    }
}
