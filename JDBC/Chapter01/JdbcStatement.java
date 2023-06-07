package Chapter01;

import java.sql.*;

public class JdbcStatement {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_info", "root", "root");
             Statement stmt = conn.createStatement()) {
            //书写SQL语句
            String sql = "INSERT INTO dept(dept_no, d_name, loc) VALUES(40, '教学部', '成都')";
            //执行SQL语句
            int i = stmt.executeUpdate(sql);
            System.out.println("影响的行数为：" + i);
        } catch (SQLException se) { // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) { // 处理 Class.forName 错误
            e.printStackTrace();
        }finally {
            System.out.println("=====END=====");
        }
    }
}
