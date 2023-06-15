package chapter11.section10;

// chapter11/section10/BoxUtil.java
public class BoxUtil {
    public static boolean containsFruit(Box<?> box) {
        return box.getItem() instanceof Apple
                || box.getItem() instanceof Orange
                || box.getItem() instanceof Banana;
    }
}