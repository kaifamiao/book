package chapter11.section12;

// chapter11/section12/EnumExample03.java
public class EnumExample03 {

    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        String colorName = "GREEN";
        Color myColor = Color.valueOf(colorName);
        System.out.println("My favorite color is " + myColor);
    }
}
