package chapter04.section08;

// chapter04/section08/Main.java
public class Main {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // 存储五个人的身高
        int[] heights = new int[5];
        // 循环输入五个人的身高
        for (int i = 0; i < heights.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个新兵的身高：");
            heights[i] = input.nextInt();
        }
        // 进行冒泡排序
        for (int i = 0; i < heights.length - 1; i++) { // 外循环控制比较多少轮
            for (int j = 0; j < heights.length - 1 - i; j++) { // 内循环控制每轮比较多少次
                if (heights[j] > heights[j + 1]) {
                    // 进行两数交换
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }
        // 将排序后结果进行输出
        System.out.println("从低到高排序后的输出：");
        for (int height : heights) {
            System.out.println(height);
        }
    }
}
