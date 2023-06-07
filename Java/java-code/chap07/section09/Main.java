package chap07.section09;

// chap07/section09/Main.java
public class Main {

    public static void main(String[] args) {
        String name = "喵星人";
        String marry = "false";    // 是否已婚
        String gender = "M";      // 性别
        String base = "7000";     // 基本工资
        String comm1 = "300";   // 基础奖金
        String res1 = "0.85";    // 基础奖金考核得分
        String comm2 = "400";   // 考核奖金
        String res2 = "0.9";      // 考核奖金得分
        String comm3 = "100";   // 全勤补助

        boolean b_marry = Boolean.parseBoolean(marry);
        char c_gender = gender.charAt(0);
        int i_base = Integer.parseInt(base);
        short s_comm1 = Short.parseShort(comm1);
        float f_res1 = Float.parseFloat(res1);
        long l_comm2 = Long.parseLong(comm2);
        double d_res2 = Double.parseDouble(res2);
        byte b_comm3 = Byte.parseByte(comm3);

        // 计算总收入
        double sum = i_base + s_comm1 * f_res1 + l_comm2 * d_res2 + b_comm3;
        System.out.println(name + "，性别(" + c_gender + ")" +
                "，婚否(" + b_marry + ")，总工资=" + sum); // 喵星人，性别(M)，婚否(false)，总工资=7715.0
    }
}
