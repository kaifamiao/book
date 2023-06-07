package chap04.section01;

// chap04/section01/Main.java
public class Main {

    public static void main(String[] args) {
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = i + 67;
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }
    }
}
