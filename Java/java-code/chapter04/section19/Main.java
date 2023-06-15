package chapter04.section19;

// chapter04/section19/Main.java
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 50, 40, 30};
        Arrays.sort(arr);//排序后 10 30 40 50
        int index = Arrays.binarySearch(arr, 10);
        System.out.println(index);
        index = Arrays.binarySearch(arr, 0);
        System.out.println(index);
        index = Arrays.binarySearch(arr, 45);
        System.out.println(index);
        index = Arrays.binarySearch(arr, 90);
        System.out.println(index);
    }
}
