package chapter04.section16;

// chapter04/section16/Main.java
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {10,50,40,30 };
        Arrays.fill(arr,40);
        System.out.println(Arrays.toString(arr));
    }
}
