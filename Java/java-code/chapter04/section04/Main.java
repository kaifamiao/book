package chapter04.section04;

// chapter04/section04/Main.java
public class Main {

    public static void main(String[] args) {
        int[] scores = new int[]{67, 78, 65, 88, 79};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("和是" + sum);
    }
}
