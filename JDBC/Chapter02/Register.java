package Chapter02;
//Chapter02/Register.java
import java.sql.*;
import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        addUser();
    }
    public static void addUser() {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users(username,userpass,age) VALUES(?,?,?)");
            ResultSet rs = null;){
            //1. 获取用户名、密码、年龄
            Scanner input = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = input.next();
            System.out.println("请输入密码：");
            String userpass = input.next();
            System.out.println("请输入年龄：");
            int age = input.nextInt();

            ps.setObject(1, username);
            ps.setObject(2, userpass);
            ps.setObject(3, age);
            //2. 执行sql语句并返回结果
            int rows = ps.executeUpdate();
            System.out.println("数据库中有"+ rows +"条数据被执行...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
