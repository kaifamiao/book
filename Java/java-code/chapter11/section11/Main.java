package chapter11.section11;

// chapter11/section11/Main.java
public class Main {
    public static void main(String[] args) {
        // 使用枚举常量
        Day today = Day.MONDAY;

        // 访问枚举常量的值
        System.out.println("Today is " + today); // 输出：Today is MONDAY

        // 使用switch语句处理枚举
        switch (today) {
            case SUNDAY:
                System.out.println("It's Sunday.");
                break;
            case MONDAY:
                System.out.println("It's Monday.");
                break;
            // 添加其他枚举常量的处理...
            default:
                System.out.println("It's not Sunday or Monday.");
        }
    }
}

