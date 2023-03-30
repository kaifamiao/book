package chap04.section09;

// chap04/section09
public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int key = 6;
        int index = binarySearch(arr, key);
        System.out.println(key + "在数组中的下标是：" + index);
    }

    static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (arr[mid] > key) {
                right = mid - 1;
            } else if (arr[mid ] < key ) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
