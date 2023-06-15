package chapter04.section18;

// chapter04/section18/Main.java
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = { 0, 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 10, 20, 30, 40, 50 };

        System.arraycopy(arr1, 0, arr2, 0, 2);
        System.out.print("array2 = " + Arrays.toString(arr2));
    }
}
