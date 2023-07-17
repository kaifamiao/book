package chapter07.section10;

// chapter07/section10/StringMain.java
public class StringMain {

    String name = "喵星人";
    boolean isMarried = false; // 是否已婚
    char gender = 'M';     // 性别
    int baseSalary = 5000;       // 基本工资
    short basicBonus = 300;     // 基础奖金
    float basicBonusScore = 0.85F;    // 基础奖金考核得分
    long performanceBonus = 400L;     // 考核奖金
    double performanceBonusScore = 0.9D;    // 考核奖金得分
    byte attendanceAllowance = 100;      // 全勤补助

    public void parseMethod1() {
        System.out.println("******* 方法1输出结果 ******");
        System.out.println("姓名：" + name);
        System.out.println("是否已婚：" + isMarried);
        System.out.println("性别：" + gender);
        System.out.println("基本工资：" + baseSalary);
        System.out.println("基础奖金：" + basicBonus);
        System.out.println("基础奖金考核得分：" + basicBonusScore);
        System.out.println("考核奖金：" + performanceBonus);
        System.out.println("考核奖金得分：" + performanceBonusScore);
        System.out.println("全勤补助：" + attendanceAllowance);
    }

    public void parseMethod2() {
        System.out.println("******* 方法2输出结果 ******");
        System.out.println("姓名：" + name);
        System.out.println("是否已婚：" + String.valueOf(isMarried));
        System.out.println("性别：" + String.valueOf(gender));
        System.out.println("基本工资：" + String.valueOf(baseSalary));
        System.out.println("基础奖金：" + String.valueOf(basicBonus));
        System.out.println("基础奖金考核得分：" + String.valueOf(basicBonusScore));
        System.out.println("考核奖金：" + String.valueOf(performanceBonus));
        System.out.println("考核奖金得分：" + String.valueOf(performanceBonusScore));
        System.out.println("全勤补助：" + String.valueOf(attendanceAllowance));
    }
}
