package Chapter01;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcDriverManager {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/company_info";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        try{
            //1. 注册 JDBC 驱动程序
            Class.forName(JDBC_DRIVER);
            //2. 建立数据库连接
            System.out.println("连接数据库...");
            conn = java.sql.DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("连接数据库 company_info 成功...");
            //3. 关闭数据库连接
            conn.close();
            System.out.println("关闭数据库 company_info 成功...");
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        }
        System.out.println("=====END=====");
    }
}
