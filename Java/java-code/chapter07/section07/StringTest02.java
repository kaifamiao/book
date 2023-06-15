package chapter07.section07;

// chapter07.section07/StringTest02.java
public class StringTest02 {

    public static void main(String[] args) {
        String firstName ="李";
        String lastName ="逵";
        String fullName = firstName.concat( lastName);
        System.out.println("姓名是"+fullName); // 姓名是李逵
    }
}
