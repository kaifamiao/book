package chap07.section07;

// chap07.section07/StringTest03.java
public class StringTest03 {

    public static void main(String[] args) {
        String school1 = "交通大学";
        String school2 = "交通大学";
        boolean isSame = school1.equals(school2);
        System.out.println("两个学校是否相同的比较结果是" + isSame); // 两个学校是否相同的比较结果是true
    }
}
