package chapter07.section02;

// chapter07/section02/Main.java
public class Main {

    public static void main(String[] args) {
        String password = "";
        for (int i = 0; i < 3; i++) {
            // 随机生成大写字母
            int big = new java.util.Random().nextInt(26);
            big += 65;
            char pass1 = (char) big;
            // 随机生成小写字母
            int small = new java.util.Random().nextInt(26);
            small += 97;
            char pass2 = (char) small;
            // 随机生成数字
            int digit = new java.util.Random().nextInt(10);
            digit += 48;
            char pass3 = (char) digit;
            // 拼接密码
            password = password + pass1 + pass2 + pass3;
        }
        System.out.println("系统为你生成了随机密码，请牢记，密码为："
                + password);
    }
}
