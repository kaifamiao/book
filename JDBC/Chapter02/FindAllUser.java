package Chapter02;
//Chapter02/FindAllUser.java
import java.sql.*;
public class FindAllUser {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            //1. 注册数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. 获取数据库连接
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
            //3. 获取发送sql语句的statement对象
            stat = conn.createStatement();
            //4. 定义sql语句
            String sql = "select * from users";
            //5. 执行sql语句并返回结果集
            rs = stat.executeQuery(sql);
            //6. 处理结果集
            System.out.println("编号\t用户名\t密码\t年龄");
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("userpass");
                int age = rs.getInt("age");
                System.out.println(id + "\t" + username + "\t" + password + "\t" + age);
            }
            //7. 释放资源
            rs.close();
            stat.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (rs != null) rs.close();
                if (stat != null) stat.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}