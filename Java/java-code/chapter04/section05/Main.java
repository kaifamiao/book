package chapter04.section05;

// chapter04/section05/Main.java
public class Main {

    public static void main(String[] args) {
        int[] scores = new int[]{67, 78, 65, 88, 79};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int avg = sum / scores.length;
        System.out.println("平均值是" + avg);
    }
}
