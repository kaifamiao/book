package chapter07.section10;

// chapter07/section10/StringMain.java
public class StringMain {

    String name = "喵星人";
    boolean b_marry = false; // 是否已婚
    char c_gender = 'M';     // 性别
    int i_base = 5000;       // 基本工资
    short s_comm1 = 300;     // 基础奖金
    float f_res1 = 0.85F;    // 基础奖金考核得分
    long l_comm2 = 400L;     // 考核奖金
    double d_res2 = 0.9D;    // 考核奖金得分
    byte b_comm3 = 100;      // 全勤补助

    public void parseMethod1() {
        System.out.println("******* 方法1输出结果 ******");
        System.out.println("姓名：" + name);
        System.out.println("是否已婚" + b_marry);
        System.out.println("性别" + c_gender);
        System.out.println("基本工资" + i_base);
        System.out.println("基础奖金" + s_comm1);
        System.out.println("基础奖金考核得分" + f_res1);
        System.out.println("考核奖金" + l_comm2);
        System.out.println("考核奖金得分" + d_res2);
        System.out.println("全勤补助" + b_comm3);
    }

    public void parseMethod2() {
        System.out.println("******* 方法2输出结果 ******");
        System.out.println("姓名：" + name);
        System.out.println("是否已婚" + String.valueOf(b_marry));
        System.out.println("性别" + String.valueOf(c_gender));
        System.out.println("基本工资" + String.valueOf(i_base));
        System.out.println("基础奖金" + String.valueOf(s_comm1));
        System.out.println("基础奖金考核得分" + String.valueOf(f_res1));
        System.out.println("考核奖金" + String.valueOf(l_comm2));
        System.out.println("考核奖金得分" + String.valueOf(d_res2));
        System.out.println("全勤补助" + String.valueOf(b_comm3));
    }
}
