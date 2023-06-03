package chap04.section17;

// chap04/section17/Main.java
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int []arr1 = new int[] {10,50,40,30 };

        // 将arr1复制成长度为3的新数组arr2
        int []arr2 = Arrays.copyOf(arr1,3);
        System.out.println(Arrays.toString(arr2));

        // 将arr1复制成长度为4的新数组arr3
        int []arr3 = Arrays.copyOf(arr1, 4);
        System.out.println(Arrays.toString(arr3));

        // 将arr1复制成长度为6的新数组arr4
        int []arr4 = Arrays.copyOf(arr1, 6);
        System.out.println(Arrays.toString(arr4));
    }
}
