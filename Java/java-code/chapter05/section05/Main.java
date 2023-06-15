package chapter05.section05;

// chapter05/section05/Main.java
public class Main {

    public static double average(int count) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("请输入第" + count + "个学生的Java成绩：");
        int java = input.nextInt();
        System.out.print("请输入第" + count + "个学生的SQL成绩：");
        int sql = input.nextInt();
        System.out.print("请输入第" + count + "个学生的Oracle成绩：");
        int oracle = input.nextInt();
        return (java + sql + oracle) * 1.0 / 3;
    }

    public static void main(String[] args) {
        double[] avg = new double[3];
        for (int i = 1; i <= avg.length; i++) {
            avg[i - 1] = average(i);
        }
        for (int i = 0; i < avg.length; i++) {
            System.out.println("第" + (i + 1) + "名学生的平均成绩是" + avg[i]);
        }
    }
}
