package Chapter02;
//Chapter02/Login.java
import java.sql.*;

public class Login {
    public static void main(String[] args) {
        login();
    }

    public static void login() {
        String sql = "SELECT * FROM users WHERE username='admin' AND userpass='456'";
        //String sql = "SELECT * FROM users WHERE username='abc' or 1=1 or 2='2' AND userpass='123'";
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            //处理结果集
            System.out.println("编号\t用户名\t密码");
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("userpass");
                System.out.println(id + "\t" + username + "\t" + password);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}