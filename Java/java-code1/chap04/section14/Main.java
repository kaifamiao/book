package chap04.section14;

// chap04/section14
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] scores = new int[][]{{67, 75}, {78, 82, 93}, {71, 72}};
        for (int i = 0; i < scores.length; i++) {
            Arrays.sort(scores[i]);
            System.out.println((i + 1) + "班排序后：");
            for (int s : scores[i]) {
                System.out.println(s);
            }
        }
    }
}
