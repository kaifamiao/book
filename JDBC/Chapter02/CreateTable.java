package Chapter02;
//Chapter02/CreateTable.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/jdbcdemo";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement()) {
            //创建表
            System.out.println("创建表...");
            String sql = "CREATE TABLE users " +
                    "(id INTEGER PRIMARY KEY AUTO_INCREMENT, " +
                    " username VARCHAR(20), " +
                    " userpass VARCHAR(20) NOT NULL , " +
                    " age INTEGER);";
            stmt.executeUpdate(sql);
            System.out.println("users创建表成功...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=====END=====");
    }
}