package chapter07.section09;

// chapter07/section09/Main.java
public class Main {
    public static void main(String[] args) {
        String employeeName = "喵星人";
        String isMarried = "false";    // 是否已婚
        String gender = "M";      // 性别
        String baseSalary = "7000";     // 基本工资
        String basicBonus = "300";   // 基础奖金
        String basicBonusScore = "0.85";    // 基础奖金考核得分
        String performanceBonus = "400";   // 考核奖金
        String performanceBonusScore = "0.9";      // 考核奖金得分
        String attendanceAllowance = "100";   // 全勤补助
        boolean isMarriedBoolean = Boolean.parseBoolean(isMarried);
        char genderChar = gender.charAt(0);
        int baseSalaryInt = Integer.parseInt(baseSalary);
        short basicBonusShort = Short.parseShort(basicBonus);
        float basicBonusScoreFloat = Float.parseFloat(basicBonusScore);
        long performanceBonusLong = Long.parseLong(performanceBonus);
        double performanceBonusScoreDouble = Double.parseDouble(performanceBonusScore);
        byte attendanceAllowanceByte = Byte.parseByte(attendanceAllowance);
        // 计算总收入
        double totalIncome = baseSalaryInt + basicBonusShort * basicBonusScoreFloat +
                performanceBonusLong * performanceBonusScoreDouble + attendanceAllowanceByte;
        // 喵星人，性别(M)，婚否(false)，总工资=7715.0
        System.out.println(employeeName + "，性别(" + genderChar + ")" +
                "，婚否(" + isMarriedBoolean + ")，总工资=" + totalIncome);
    }
}
