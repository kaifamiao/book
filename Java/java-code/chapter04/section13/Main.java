package chapter04.section13;

// chapter04/section13/Main.java
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {10, 50, 40, 30};
        int[] arr2 = {10, 50, 40, 30};
        int[] arr3 = {60, 50, 85};
        // 判断arr1与arr2的长度及元素是否相等
        System.out.println(Arrays.equals(arr1, arr2));
        // 判断arr1与arr3的长度及元素是否相等
        System.out.println(Arrays.equals(arr1, arr3));
    }
}
