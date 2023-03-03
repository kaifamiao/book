package chap05.section03;

// chap05/section03
public class Main {

    //定义方法
    public static void average() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("请输入Java成绩：");
        int java = input.nextInt();
        System.out.print("请输入SQL成绩：");
        int sql = input.nextInt();
        System.out.print("请输入Oracle成绩：");
        int oracle = input.nextInt();
        double result1 = (java + sql + oracle) * 1.0 / 3;
        System.out.println("该喵星人的平均成绩是:" + result1);
    }
    public static void main(String[] args) {
        average();// 第一次方法调用计算第一个学生成绩。
        average();// 第二次方法调用计算第二个学生成绩。
        average();// 第三次方法调用计算第三个学生成绩。
    }
}
