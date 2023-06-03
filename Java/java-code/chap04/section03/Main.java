package chap04.section03;

// chap04/section03/Main.java
public class Main {

    public static void main(String[] args) {
        int[] scores = new int[]{67, 78, 65, 88, 79};
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("最小值是" + min);
    }
}
