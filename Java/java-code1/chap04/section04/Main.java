package chap04.section04;

// chap04/section04
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
