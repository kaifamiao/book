package Chapter03;
//Chapter03/C3P0Example.java
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C3P0Example {
    public static void main(String[] args) {
        // 创建连接池
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        try{
            // 设置连接池的参数
            cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
            cpds.setJdbcUrl("jdbc:mysql://localhost:3306/jdbcdemo");
            cpds.setUser("root");
            cpds.setPassword("root");
            cpds.setInitialPoolSize(10);
            // 获取连接
            Connection conn = cpds.getConnection();
            // 执行SQL语句
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users");
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("userpass");
                String age = rs.getString("age");
                System.out.println("username: " + username + ",password: " + password + ",age: " + age);
            }
            // 关闭连接
            rs.close();
            stmt.close();
            conn.close();
        } catch (PropertyVetoException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭连接池
            cpds.close();
        }
    }
//使用C3P0数据库连接池的方式，获取数据库的连接
public static Connection getConnection1() throws Exception {
    ComboPooledDataSource cpds = new ComboPooledDataSource();
    cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
    cpds.setJdbcUrl("jdbc:mysql://localhost:3306/jdbcdemo");
    cpds.setUser("root");
    cpds.setPassword("root");
    cpds.setInitialPoolSize(10);
    Connection conn = cpds.getConnection();
    return conn;
}

//使用C3P0数据库连接池的配置文件方式，获取数据库的连接
private static DataSource cpds = new ComboPooledDataSource("helloc3p0");
public static Connection getConnection2() throws Exception {
    Connection conn = cpds.getConnection();
    return conn;
}
}
