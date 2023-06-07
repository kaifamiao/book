package Chapter01;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //1. 注册 JDBC 驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. 建立数据库连接
            System.out.println("连接数据库...");
            conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/company_info","root","root");
            // 实例化 Statement 对象
            System.out.println("实例化 Statement 对象...");
            stmt = conn.createStatement();
            String sql = "INSERT INTO dept(dept_no, d_name, loc) VALUES (100, '研发部', '北京')";
            //关闭资源
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("=====END=====");
    }
}
