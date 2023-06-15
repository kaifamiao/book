package chapter04.section06;

// chapter04/section06/Main.java
public class Main {

    public static void main(String[] args) {
        int[] scores =new int [] {67,78,65,88,79};
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第"+(i+1)+"个元素是"+scores[i]);
        }
    }
}
