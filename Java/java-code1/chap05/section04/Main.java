package chap05.section04;

// chap05/section04
public class Main {

    public static double average() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("请输入Java成绩：");
        int java = input.nextInt();
        System.out.print("请输入SQL成绩：");
        int sql = input.nextInt();
        System.out.print("请输入Oracle成绩：");
        int oracle = input.nextInt();
        return (java + sql + oracle) * 1.0 / 3;
    }

    public static void main(String[] args) {
        double result1 = average();// 第一次方法调用。
        double result2 = average();// 第二次方法调用。
        double result3 = average();// 第三次方法调用。
        System.out.println("第一名喵星人的成绩是" + result1);
        System.out.println("第二名喵星人的成绩是" + result2);
        System.out.println("第三名喵星人的成绩是" + result3);
    }
}
