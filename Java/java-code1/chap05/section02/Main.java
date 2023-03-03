package chap05.section02;

// chap05/section02
public class Main {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // 第一个学生的成绩
        System.out.println("请输入Java成绩：");
        int java1 = input.nextInt();
        System.out.println("请输入SQL成绩：");
        int sql1 = input.nextInt();
        System.out.println("请输入Oracle成绩：");
        int oracle1 = input.nextInt();
        double result1 = (java1 + sql1 + oracle1) * 1.0 / 3;
        System.out.println("第一个喵星人的平均成绩是：" + result1);
        // 第二个学生的成绩
        System.out.println("请输入Java成绩：");
        int java2 = input.nextInt();
        System.out.println("请输入SQL成绩：");
        int sql2 = input.nextInt();
        System.out.println("请输入Oracle成绩：");
        int oracle2 = input.nextInt();
        double result2 = (java2 + sql2 + oracle2) * 1.0 / 3;
        System.out.println("第二个喵星人的平均成绩是：" + result2);
        // 第三个学生的成绩
        System.out.println("请输入Java成绩：");
        int java3 = input.nextInt();
        System.out.println("请输入SQL成绩：");
        int sql3 = input.nextInt();
        System.out.println("请输入Oracle成绩：");
        int oracle3 = input.nextInt();
        double result3 = (java3 + sql3 + oracle3) * 1.0 / 3;
        System.out.println("第三个喵星人的平均成绩是：" + result3);
    }
}
